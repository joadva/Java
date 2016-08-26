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

public class CompTabla2 extends JPanel implements ActionListener
{
   //private String[]     etiquetas  ={"H 1"};
     private static String[]     etiquetas2 ={"Li","Na","K","Rb","Cs","Fr"};
   //private String[]     etiquetas3 ={"Be","Mg","Ca","Sr","Ba","Ra"};
   //private String[]     etiquetas4 ={"Sc","Y","Ti","Zr","Hf","Rf","V","Nb","Ta","Db","Cr","Mo","W","Sg","Mn",
   //                                "Tc","Re","Bh","Fe","Ru","Os","Hs","Co","Rh","Ir","Mt","Ni","Pd","Pt","Ds","Cu","Ag","Au","Rg","Zn","Cd","Hg","Cn"};
   //private String[]     etiquetas5 ={"Al","Ga","In","Ti","Uut","Ge","Sn","Pb","Fi","Sb","Bi","Uup","Po","Lv"};
   //private String[]     etiquetas6 ={"B","C","Si","N","P","As","O","S","Se","Te","F","Ci","Br","I","At"};
   //private String[]     etiquetas7 ={"He 2","Ne","Ar","Kr","Xe","Rn","Uuo"};
   //private String[]     posicion   ={"cell 0 0"};
  
   //private CompBoton3[] bNumeros   =new CompBoton3[etiquetas.length];
   private CompBoton4[] bNumeros2  =new CompBoton4[etiquetas2.length];
   //private CompBoton2[] bNumeros3  =new CompBoton2[etiquetas3.length];
   //private CompBoton5[] bNumeros4  =new CompBoton5[etiquetas4.length];
   //private CompBoton7[] bNumeros5  =new CompBoton7[etiquetas5.length];
   //private CompBoton6[] bNumeros6  =new CompBoton6[etiquetas6.length];
  // private CompBoton7[] bNumeros7  =new CompBoton7[etiquetas7.length];
   
   public CompTabla2(JPanel pPanel)
   {
    //  this.setLayout(new MigLayout("","[100px,grow,fill][100px,grow,fill][100px,grow,fill]","[40px,grow,fill][40px,grow,fill][40px,grow,fill][40px,grow,fill]"));
      //for(int i=0; i<bNumeros.length; i++)
      //{
      //   bNumeros[i]=new CompBoton3(this,etiquetas[i],this,posicion[i]);
      //}
      for(int i=0; i<bNumeros2.length; i++)
      {
         bNumeros2[i]=new CompBoton4(this,etiquetas2[i],this,"Elemento");
      }
      //for(int i=0; i<bNumeros3.length; i++)
      // {
      // bNumeros3[i]=new CompBoton2(this,etiquetas3[i],this,"Elemento");
      //}
      //for(int i=0; i<bNumeros4.length; i++)
      //{
      //   bNumeros4[i]=new CompBoton5(this,etiquetas4[i],this,"Elemento");
      //}
      //for(int i=0; i<bNumeros5.length; i++)
      //{
      //  bNumeros5[i]=new CompBoton7(this,etiquetas5[i],this,"Elemento");
      //}
      //for(int i=0; i<bNumeros6.length; i++)
      //{
      //   bNumeros6[i]=new CompBoton6(this,etiquetas6[i],this,posicion6[i]);
      //}
      //for(int i=0; i<bNumeros7.length; i++)
      //{
      //   bNumeros7[i]=new CompBoton7(this,etiquetas7[i],this,posicion7[i]);
      //}
      
      pPanel.add(this);
   }

   public void actionPerformed(ActionEvent pE)
   {
      System.out.println(pE.getActionCommand());
   }
}
