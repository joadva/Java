package componentes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;


public class CompCalculadora extends JPanel implements ActionListener
{
   private String[]     etiquetas ={"MC","MR","MS","M+","M-","<---","CE","C","+-","Raiz","7","8","9","/","%","4","5","6","*","1/x","1","2","3","-","=","0",".","+"};
   private String[]     posicion  ={"cell 1 3","cell 1 4","cell 1 5","cell 1 6","cell 1 7","cell 2 3","cell 2 4","cell 2 5","cell 2 6","cell 2 7","cell 3 3","cell 3 4",
                                    "cell 3 5","cell 3 6","cell 3 7","cell 4 3","cell 4 4","cell 4 5","cell 4 6","cell 4 7","cel 5 3","cell 5 4","cell 5 5","cell 5 6","cell 5 7",
                                    "cell 6 3","cell 6 5","cell 6 6"};
   private CompBoton2[] bNumeros  =new CompBoton2[etiquetas.length];
   
   public CompCalculadora(JPanel pPanel)
   {
      this.setLayout(new MigLayout("","[100px,grow,fill][100px,grow,fill][100px,grow,fill]","[40px,grow,fill][40px,grow,fill][40px,grow,fill][40px,grow,fill]"));
      for(int i=0; i<bNumeros.length; i++)
      bNumeros[i]=new CompBoton2(this,etiquetas[i],this,posicion[i]);
      pPanel.add(this);
   }
   
   public void actionPerformed(ActionEvent e)
   {
   }
}
