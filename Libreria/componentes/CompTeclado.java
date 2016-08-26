package componentes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class CompTeclado extends JPanel implements ActionListener
{
   private String[]     etiquetas ={"esc","Supr","|","1","2","3","4","5","6","7","8","9","0","?","¿","Borrar","Q","W","E","R","T","Y","U","I","O","P","´´","*","Enter",
                                    "A","S","D","F","G","H","J","K","L","Ñ","{","}","<>","Z","X","C","V","B","N","M",";",":","-","Arriba","Ctrl","Inicio","alt","","AltGr","Ctrl",
                                    "Izquierda","Abajo","Derecha"};
   private String[]     posicion  ={"cell 0 0","cell 13 0","cell 0 1","cell 1 1","cell 2 1","cell 3 1","cell 4 1","cell 5 1","cell 6 1","cell 7 1","cell 8 1","cell 9 1","cell 10 1",
                                    "cell 11 1","cell 12 1", "cell 13 1","cell 0 2","cell 1 2","cell 2 2","cell 3 2","cell 4 2","cell 5 2","cell 6 2","cell 7 2","cell 8 2","cell 9 2",
                                    "cell 10 2","cell 11 2","cell 12 2 2 3","cell 0 3", "cell 1 3","cell 2 3","cell 3 3","cell 4 3","cell 5 3","cell 6 3","cell 7 3","cell 8 3","cell 9 3",
                                    "cell 10 3","cell 11 3","cell 0 4","cell 1 4","cell 2 4","cell 3 4","cell 4 4","cell 5 4","cell 6 4","cell 7 4","cell 8 4","cell 9 4","cell 10 4","cell 11 4",
                                    "cell 0 5","cell 1 5","cell 2 5","cell 3 5 6 2","cell 8 5","cell 9 5","cell 10 5","cell 11 5","cell 12 5"};
   private CompBoton2[] bNumeros  =new CompBoton2[etiquetas.length];
   
   public CompTeclado(JPanel pPanel,ActionListener pAccion)
   {
      this.setLayout(new MigLayout("","[100px,grow,fill][100px,grow,fill][100px,grow,fill]","[40px,grow,fill][40px,grow,fill][40px,grow,fill][40px,grow,fill]"));
      for(int i=0; i<bNumeros.length; i++)bNumeros[i]=new CompBoton2(this,etiquetas[i],pAccion,posicion[i]);
      pPanel.add(this);
      this.setBackground(Color.WHITE);
   }
   

   public void actionPerformed(ActionEvent PArg0)
   {
   }
}
