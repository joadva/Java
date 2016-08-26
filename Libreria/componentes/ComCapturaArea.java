package componentes;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComCapturaArea extends JPanel implements KeyListener,FocusListener
{
   private JLabel      lEtiqueta;
   private JTextArea   tCampo;
   private JScrollPane Scroll;
   private boolean     marcaDeAgua;
   private double      tamEtiqueta;
   private double      tamCampo;
   
   public ComCapturaArea(JPanel pPanel,String pEtiqueta)
   {
      this(pPanel,pEtiqueta,null);
   }
   
   public ComCapturaArea(JPanel pPanel,String pEtiqueta,double pTamCampo)
   {
      this(pPanel,pEtiqueta,null,ComCapturaCampo.TAM_ETIQUETA,pTamCampo);
   }
   
   public ComCapturaArea(JPanel pPanel,String pEtiqueta,String pCampo)
   {
      this(pPanel,pEtiqueta,pCampo,ComCapturaCampo.TAM_ETIQUETA,ComCapturaCampo.TAM_CAMPO);
   }
   
   public ComCapturaArea(JPanel pPanel,String pEtiqueta,String pCampo,double pTamEtiqueta,double pTamCampo)
   {
      if(pEtiqueta==null) pEtiqueta="Nueva área:";
      if(pCampo==null) pCampo="Ingrese "+pEtiqueta;
      lEtiqueta=new JLabel(pEtiqueta);
      tCampo=new JTextArea(pCampo,1000,30);
      marcaDeAgua=true;
      tCampo.setSelectionStart(0);
      tCampo.setSelectionEnd(pCampo.length());
      tCampo.setForeground(Color.LIGHT_GRAY);
      tCampo.addKeyListener(this);
      tCampo.addFocusListener(this);
      
      Scroll=new JScrollPane(Scroll);
      tamEtiqueta=pTamEtiqueta;
      tamCampo=pTamCampo;
      this.setLayout(new FlowLayout());
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
