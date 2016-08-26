package componentes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import Colores.CompBoton3;
import Colores.CompBoton4;
import Colores.CompBoton5;
import Colores.CompBoton6;
import Colores.CompBoton7;

public class CompTabla extends JPanel implements ActionListener
{
   private String[]     etiquetas  ={"H 1"};
   private String[]     etiquetas2 ={"Li","Na","K","Rb","Cs","Fr"};
   private String[]     etiquetas3 ={"Be","Mg","Ca","Sr","Ba","Ra"};
   private String[]     etiquetas4 ={"Sc","Y","Ti","Zr","Hf","Rf","V","Nb","Ta","Db","Cr","Mo","W","Sg","Mn",
                                   "Tc","Re","Bh","Fe","Ru","Os","Hs","Co","Rh","Ir","Mt","Ni","Pd","Pt","Ds","Cu","Ag","Au","Rg","Zn","Cd","Hg","Cn"};
   private String[]     etiquetas5 ={"Al","Ga","In","Ti","Uut","Ge","Sn","Pb","Fi","Sb","Bi","Uup","Po","Lv"};
   private String[]     etiquetas6 ={"B","C","Si","N","P","As","O","S","Se","Te","F","Ci","Br","I","At"};
   private String[]     etiquetas7 ={"He 2","Ne","Ar","Kr","Xe","Rn","Uuo"};
   private String[]     posicion   ={"cell 0 0"};
   private String[]     posicion2  ={"cell 0 1","cell 0 2","cell 0 3","cell 0 4","cell 0 5","cell 0 6"};
   private String[]     posicion3  ={"cell 1 1","cell 1 2","cell 1 3","cell 1 4","cell 1 5","cell 1 6"};
   private String[]     posicion4  ={"cell 2 3","cell 2 4","cell 3 3","cell 3 4","cell 3 5","cell 3 6","cell 4 3","cell 4 4","cell 4 5","cell 4 6","cell 5 3","cell 5 4","cell 5 5",
                                   "cell 5 6","cell 6 3","cell 6 4","cell 6 5","cell 6 6","cell 7 3","cell 7 4","cell 7 5","cell 7 6","cell 8 3","cell 8 4","cell 8 5","cell 8 6",
                                   "cell 9 3","cell 9 4","cell 9 5","cell 9 6","cell 10 3","cell 10 4","cell 10 5","cell 10 6","cell 11 3","cell 11 4","cell 11 5","cell 11 6"};
   private String[]     posicion5  ={"cell 12 2","cell 12 3","cell 12 4","cell 12 5","cell 12 6","cell 13 3","cell 13 4","cell 13 5","cell 13 6","cell 14 4","cell 14 5","cell 14 6",
                                   "cell 15 5","cell 15 6"};
   private String[]     posicion6  ={"cell 12 1","cell 13 1","cell 13 2","cell 14 1","cell 14 2","cell 14 3","cell 15 1","cell 15 2","cell 15 3","cell 15 4","cell 16 1","cell 16 2","cell 16 3","cell 16 4","cell 16 5"};
   private String[]     posicion7  ={"cell 17 0","cell 17 1", "cell 17 2","cell 17 3","cell 17 4","cell 17 5","cell 17 6"};
   private CompBoton3[] bNumeros   =new CompBoton3[etiquetas.length];
   private CompBoton4[] bNumeros2  =new CompBoton4[etiquetas2.length];
   private CompBoton2[] bNumeros3  =new CompBoton2[etiquetas3.length];
   private CompBoton5[] bNumeros4  =new CompBoton5[etiquetas4.length];
   private CompBoton7[] bNumeros5  =new CompBoton7[etiquetas5.length];
   private CompBoton6[] bNumeros6  =new CompBoton6[etiquetas6.length];
   private CompBoton7[] bNumeros7  =new CompBoton7[etiquetas7.length];
   
   public CompTabla(JPanel pPanel)
   {
      this.setLayout(new MigLayout("","[100px,grow,fill][100px,grow,fill][100px,grow,fill]","[40px,grow,fill][40px,grow,fill][40px,grow,fill][40px,grow,fill]"));
      for(int i=0; i<bNumeros.length; i++)
      {
         bNumeros[i]=new CompBoton3(this,etiquetas[i],this,posicion[i]);
      }
      for(int i=0; i<bNumeros2.length; i++)
      {
         bNumeros2[i]=new CompBoton4(this,etiquetas2[i],this,posicion2[i]);
      }
      for(int i=0; i<bNumeros3.length; i++)
      {
         bNumeros3[i]=new CompBoton2(this,etiquetas3[i],this,posicion3[i]);
      }
      for(int i=0; i<bNumeros4.length; i++)
      {
         bNumeros4[i]=new CompBoton5(this,etiquetas4[i],this,posicion4[i]);
      }
      for(int i=0; i<bNumeros5.length; i++)
      {
         bNumeros5[i]=new CompBoton7(this,etiquetas5[i],this,posicion5[i]);
      }
      for(int i=0; i<bNumeros6.length; i++)
      {
         bNumeros6[i]=new CompBoton6(this,etiquetas6[i],this,posicion6[i]);
      }
      for(int i=0; i<bNumeros7.length; i++)
      {
         bNumeros7[i]=new CompBoton7(this,etiquetas7[i],this,posicion7[i]);
      }
      
      pPanel.add(this);
   }

   public void actionPerformed(ActionEvent pE)
   {
      System.out.println(pE.getActionCommand());
   }
}
