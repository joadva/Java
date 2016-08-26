package NuevosComp;

import javax.swing.UIManager;

public class CompEstilo
{
   
   public static void Nimbus()
   {
      try
      {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
      }catch(Exception e)
      {
         //Ignorar
      }
   }
   
   public static void metal()
   {
      try
      {
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
      }catch(Exception e)
      {
         //Ignorar
      }
   }
}
