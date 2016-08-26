package componentes;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ComCapturaCampo extends JPanel implements KeyListener,FocusListener
{
   private JLabel       lEtiqueta;
   private JTextField   tCampo;
   private boolean      marcaDeAgua;
   private double       tamEtiqueta;
   private double       tamCampo;
   public static double TAM_ETIQUETA =0.3;
   public static double TAM_CAMPO    =0.7;
   
   /**
    * @wbp.parser.constructor
    */
   public ComCapturaCampo(JPanel pPanel,String pEtiqueta)
   {
      this(pPanel,pEtiqueta,null);
   }

   public ComCapturaCampo(JPanel pPanel,String pEtiqueta,double pTamCampo)
   {
      this(pPanel,pEtiqueta,null,TAM_ETIQUETA,pTamCampo);
   }
   
   public ComCapturaCampo(JPanel pPanel,String pEtiqueta,String pCampo)
   {
      this(pPanel,pEtiqueta,pCampo,TAM_ETIQUETA,TAM_CAMPO);
   }
   
   public ComCapturaCampo(JPanel pPanel,String pEtiqueta,String pCampo,double pTamEtiqueta,double pTamCampo)
   {
      if(pEtiqueta==null) pEtiqueta="Campo nuevo:";
      if(pCampo==null) pCampo="Ingrese "+pEtiqueta;
      lEtiqueta=new JLabel(pEtiqueta);
      tCampo=new JTextField(pCampo);
      tCampo.setSelectionStart(0);
      tCampo.setSelectionEnd(pCampo.length());
      tCampo.setForeground(Color.LIGHT_GRAY);
      marcaDeAgua=true;
      tCampo.addKeyListener(this);
      tCampo.addFocusListener(this);
      tamEtiqueta=pTamEtiqueta;
      tamCampo=pTamCampo;
      this.setLayout(new GridLayout());
      this.add(lEtiqueta);
      this.add(tCampo);
      if(pPanel!=null) pPanel.add(this);
      this.setLayout(null);
      this.setBackground(Color.LIGHT_GRAY);
   }
   
   public void doLayout()
   {
      super.doLayout();
      int ancho=(int)(this.getWidth()*tamEtiqueta);
      lEtiqueta.setBounds(5,1,ancho-5,this.getHeight()-2);
      tCampo.setBounds(ancho+5,1,(int)(this.getWidth()*tamCampo-10),this.getHeight()-2);
   }
   
   public String getText()
   {
      return tCampo.getText();
   }
   
   public void setText(String pTexto)
   {
      cambiarMarcaDeAgua();
      tCampo.setText(pTexto);
   }
   
   public void keyPressed(KeyEvent pE)
   {
      cambiarMarcaDeAgua();
   }
   
   private void cambiarMarcaDeAgua()
   {
      if(marcaDeAgua)
      {
         tCampo.setForeground(Color.BLACK);
         tCampo.setText("");
         marcaDeAgua=false;
      }
   }

   public void keyReleased(KeyEvent pE)
   {
   }
   
   public void focusGained(FocusEvent pE)
   {
      if(marcaDeAgua) tCampo.setText("");
   }
   
   public void focusLost(FocusEvent pE)
   {
      if(marcaDeAgua) tCampo.setText("ingrese "+lEtiqueta.getText());
   }
   
   public void keyTyped(KeyEvent pE)
   {
   }
}