package componentes;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CompControl extends JPanel implements KeyListener,MouseListener
{
   private JButton bBoton;
   private JLabel  lEtiqueta;
   private JLabel  lEtiqueta2;
   private JLabel  lEtiqueta3;
   private JLabel  lEtiqueta4;
   
   public CompControl(JPanel pPanel,KeyListener pDireccion,MouseListener pMouse)
   {
      if(pPanel!=null) pPanel.add(this);
      if(pDireccion!=null) pPanel.add(this);
      this.setLayout(new BorderLayout());
      lEtiqueta=new JLabel("Arriba");
      lEtiqueta.setHorizontalAlignment(SwingConstants.CENTER);
      lEtiqueta.addMouseListener(this);
      lEtiqueta2=new JLabel("Abajo");
      lEtiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
      lEtiqueta2.addMouseListener(this);
      lEtiqueta3=new JLabel("Izquierda");
      lEtiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
      lEtiqueta3.addMouseListener(this);
      lEtiqueta4=new JLabel("Derecha");
      lEtiqueta4.setHorizontalAlignment(SwingConstants.CENTER);
      lEtiqueta4.addMouseListener(this);
      bBoton=new CompBoton(pPanel,"Accion",null);
      bBoton.addKeyListener(this);
      bBoton.addKeyListener(pDireccion);
      this.addKeyListener(this);
      this.addKeyListener(pDireccion);
      this.setFocusable(true);
      this.requestFocus();
      reset();
   }
   
   public void reset()
   {
      this.add(lEtiqueta,BorderLayout.NORTH);
      this.add(lEtiqueta2,BorderLayout.SOUTH);
      this.add(lEtiqueta3,BorderLayout.WEST);
      this.add(lEtiqueta4,BorderLayout.EAST);
      this.add(bBoton,BorderLayout.CENTER);
      doLayout();
   }
   
   public void keyTyped(KeyEvent pE)
   {
   }
   
   public void keyPressed(KeyEvent pE)
   {
      accionar(pE.getKeyCode());
   }
   
   public void accionar(int pKeyCode)
   {
      reset();
      if(pKeyCode==KeyEvent.VK_UP)
      {
         this.add(bBoton,BorderLayout.NORTH);
         this.add(lEtiqueta,BorderLayout.CENTER);
      }
      else if(pKeyCode==KeyEvent.VK_DOWN)
      {
         this.add(bBoton,BorderLayout.SOUTH);
         this.add(lEtiqueta2,BorderLayout.CENTER);
      }
      else if(pKeyCode==KeyEvent.VK_LEFT)
      {
         this.add(bBoton,BorderLayout.WEST);
         this.add(lEtiqueta3,BorderLayout.CENTER);
      }
      else if(pKeyCode==KeyEvent.VK_RIGHT)
      {
         this.add(bBoton,BorderLayout.EAST);
         this.add(lEtiqueta4,BorderLayout.CENTER);
      }
      doLayout();
      this.requestFocus();
   }
   
   public void keyReleased(KeyEvent pE)
   {
      reset();
   }
   
   public void mouseClicked(MouseEvent pE)
   {
   }
   
   public void mousePressed(MouseEvent pE)
   {
      if(lEtiqueta.equals(pE.getSource()))// SI SE PRESIONA EL MOUSE SOBRE LA
                                          // ETIQUETA ARRIBA,
      {
         accionar(KeyEvent.VK_UP);// SE REALIZARA LA ACCION DEL METODO ACCIONAR
                                  // SI SE OPRIME LA TECLA UP (VER LINEAS 51 Y
                                  // 57)
      }
      else if(lEtiqueta2.equals(pE.getSource()))// (SI NÓ),SI SE PRESIONA EL
                                                // MOUSE SOBRE LA ETIQUETA
                                                // ABAJO,
      {
         accionar(KeyEvent.VK_DOWN);// SE REALIZARA LA ACCION DEL METODO
                                    // ACCIONAR SI SE OPRIME LA TECLA DOWN (VER
                                    // LINEAS 51 Y 62)
      }
      else if(lEtiqueta3.equals(pE.getSource()))// (SI NÓ),SI SE PRESIONA EL
                                                // MOUSE SOBRE LA ETIQUETA
                                                // IZQUIERDA,
      {
         accionar(KeyEvent.VK_LEFT);// SE REALIZARA LA ACCION DEL METODO
                                    // ACCIONAR SI SE OPRIME LA TECLA LEFT (VER
                                    // LINEAS 51 Y 67)
      }
      else if(lEtiqueta4.equals(pE.getSource()))// (SI NÓ),SI SE PRESIONA EL
                                                // MOUSE SOBRE LA ETIQUETA
                                                // DERECHA,
      {
         accionar(KeyEvent.VK_RIGHT);// SE REALIZARA LA ACCION DEL METODO
                                     // ACCIONAR SI SE OPRIME LA TECLA RIGHT
                                     // (VER LINEAS 51 Y 67)
      }
   }
   
   public void mouseReleased(MouseEvent pE)
   {
      reset();
   }
   
   public void mouseEntered(MouseEvent pE)
   {
   }
   
   public void mouseExited(MouseEvent pE)
   {
   }
}
