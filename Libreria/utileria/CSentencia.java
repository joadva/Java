package utileria;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CSentencia
{
   public static void imprimir(String texto)
   {
      imprimir(texto,0,0);
   }
   public static void imprimir(String  texto,int filas, int columnas)
   {     
         JTextArea tArea=new JTextArea(texto,filas,columnas);
         tArea.setFont(new Font("Arial",Font.BOLD,10));
         tArea.setEditable(false);
         tArea.setForeground(Color.GREEN);
         tArea.setBackground(Color.BLUE);
         JScrollPane sArea=new JScrollPane(tArea);
         JOptionPane.showMessageDialog(null,sArea);
   }
   public static int leer(int dato)
   {
      return Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor entero",dato));
   }
   public static double leer(double dato)
   {
      return Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor entero",dato));
   }
  
}
