package utileria;

public class CElementos
{
   public static String Hidrogeno()
   {
      String nombre="Hidrogeno";
      String grupo= "1A";
      int    numeroAtomico=1;
      double numeroDeMasa =1;
      String texto = String.format("===========================\n"+
                                   "Nombre=  %s                \n"+
                                   "Grupo=   %s                \n"+
                                   "Numero atomico=   %d       \n"+
                                   "Numero de masa=   %f       \n"+
                                   "===========================\n",
                                   nombre,
                                   grupo,
                                   numeroAtomico,
                                   numeroDeMasa
                                   );
            return texto;
   }
}
