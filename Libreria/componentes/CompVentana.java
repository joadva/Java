package componentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class CompVentana extends JFrame implements ActionListener
{
   private   JLabel lEncabezado;
   protected JPanel pContenido;
   protected JPanel pPie;
   
   public CompVentana(String pEncabezado)
   {
      this (pEncabezado,false);
   }
   public CompVentana(String pEncabezado, boolean pPrincipal)
   {
      this(pEncabezado,pPrincipal,0,0);
   }
   public CompVentana(String pEncabezado,boolean pPrincipal,int pX,int pY)
   {
      this(pEncabezado,pPrincipal,pX,pY,Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
   }
   public CompVentana(String pEncabezado,boolean pPrincipal, int pX, int pY, int pAncho, int pLargo)
   {
      this.setTitle(pEncabezado);
      this.setBackground(pPrincipal?Color.BLUE:Color.GREEN);
      this.setDefaultCloseOperation(pPrincipal?EXIT_ON_CLOSE:DISPOSE_ON_CLOSE);
      this.setBounds(pX+(pPrincipal?0:50),pY+(pPrincipal?0:50),pAncho,pLargo);
      this.setLayout(new BorderLayout());
      lEncabezado=new JLabel(pEncabezado);
      lEncabezado.setHorizontalAlignment(JLabel.CENTER);
      lEncabezado.setBackground(pPrincipal?Color.CYAN:Color.GREEN);
      lEncabezado.setForeground(pPrincipal?Color.RED:Color.YELLOW);
      lEncabezado.setOpaque(true);
      lEncabezado.setBorder(BorderFactory.createLineBorder(Color.black));
      lEncabezado.setFont(new Font("Comic sans Ms",Font.BOLD+Font.ITALIC,40));
      pContenido= new JPanel(null);
      pContenido.setBackground(pPrincipal?Color.LIGHT_GRAY:this.getBackground());
      pPie=new JPanel(new BorderLayout());
      pPie.setBackground(pPrincipal?Color.BLUE:Color.DARK_GRAY);
      this.add(lEncabezado, BorderLayout.NORTH);
      this.add(pContenido, BorderLayout.CENTER);
      this.add(pPie,BorderLayout.SOUTH);
      crearContenido();
      this.setVisible(true);
   }
   
   protected abstract void crearContenido();
}
 