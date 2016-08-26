package NuevosComp;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public  class CompJMenu extends JMenu
{
   public CompJMenu(JMenuBar pBar,String pTitulo)
   {
      pBar.add(this);
      this.setText(pTitulo);
   }
   
   public CompJMenu(JMenu pMenu,String pTitulo)
   {
      pMenu.add(this);
      this.setText(pTitulo);
   }
}
