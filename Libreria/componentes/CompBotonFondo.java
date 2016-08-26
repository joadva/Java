package componentes;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CompBotonFondo extends JButton 
{
   /**
    * Create the panel.
    */
   public CompBotonFondo(ImageIcon icon, ActionListener pAction)
   {
      setIcon(icon);
      setMargin(new Insets(0,0,0,0));
      setIconTextGap(0);
      setBorderPainted(false);
      setBorder(null);
      setText(null);
      this.addActionListener(pAction);
      setSize(icon.getImage().getWidth(null),icon.getImage().getHeight(null));
   }

   
}
