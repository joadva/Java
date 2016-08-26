package componentes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CompSwitch extends JPanel implements ActionListener
{
   private JButton bBoton;
   private JLabel  lEtiqueta;
   private boolean isEncendido;
   public CompSwitch(JPanel pPanel,boolean pIsEncendido,ActionListener pAction)
   {
      isEncendido=pIsEncendido;
      lEtiqueta  =new JLabel(isEncendido?"On": "Off");
      bBoton     =new JButton();
      bBoton.setBackground(isEncendido?Color.GREEN: Color.RED);
      bBoton.addActionListener(this);
      bBoton.addActionListener(pAction);
      this.setLayout(new BorderLayout());
      this.add(bBoton,BorderLayout.CENTER);
      this.add(lEtiqueta,isEncendido?BorderLayout.WEST: BorderLayout.EAST);
      if(pPanel!=null) pPanel.add(this);
   }
   public void actionPerformed(ActionEvent pE)
   {
      isEncendido = !isEncendido;
      lEtiqueta.setText(isEncendido? "On":"Off");
      this.add(lEtiqueta,isEncendido? BorderLayout.WEST: BorderLayout.EAST);
      bBoton.setBackground(isEncendido?Color.GREEN: Color.RED);
   }
   
   public boolean isOn()
   {
      return isEncendido;
   }
}