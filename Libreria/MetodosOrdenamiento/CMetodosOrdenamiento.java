package MetodosOrdenamiento;
public class CMetodosOrdenamiento
{
   public static double[] MetodoBurbuja(double[] arr)
   {
      double aux;
      boolean cambios=false;
      while(true)
      {
         cambios=false;
         for(int i=1; i<arr.length; i++)
         {
            if(arr[i]<arr[i-1])
            {
               aux=arr[i];
               arr[i]=arr[i-1];
               arr[i-1]=aux;
               cambios=true;
            }
         }
         if(cambios==false)
            break;
      }
      return arr;
   }
}
