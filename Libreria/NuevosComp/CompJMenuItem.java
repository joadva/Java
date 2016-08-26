package NuevosComp;

import java.awt.event.ActionListener;
import javax.swing.*;

public class CompJMenuItem extends JMenuItem
{
   public CompJMenuItem(JMenu pMenu, String pTitulo,ActionListener pA )
   {
      this.setText(pTitulo);
      this.addActionListener(pA);
      pMenu.add(this);
   }
   
   public CompJMenuItem(JMenu pMenu, String pTitulo,ActionListener pA,String Imagen )
   {
      this.setText(pTitulo);
      this.addActionListener(pA);
      pMenu.add(this);
   }
}
