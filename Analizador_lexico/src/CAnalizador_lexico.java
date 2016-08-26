import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CAnalizador_lexico 
{

	public static void main(String[] args)
	{
	   String patron=("(sii)|([a-zA-Z]+)|([>|<|=|(|)]+)|([0-9]+)|( )");
	   String texto =("sii (contador<1) < (x=1) ");
	   
	   Pattern p= Pattern.compile(patron);
	   Matcher m=p.matcher(texto);
	   while(m.find())
	   {
		   
		   String token1=m.group(1);
		   String token2=m.group(2);
		   String token3=m.group(3);
		   String token4=m.group(4);
		   String token5=m.group(5);
		   if(token1 != null)
		   {
			   System.out.println("Palabra reservada: "+token1);
		   }
		   else if(token2 != null)
		   {
			   System.out.println("Cadena de caracteres: "+token2);
		   }
		   else if(token3 != null)
		   {
			   System.out.println("Carateres especiales: "+token3);
		   }
		   else if(token4 !=null)
		   {
			   System.out.println("Numeros: "+token4);
		   }
		   else if(token5!=null)
		   {
			   System.out.println("Espacio vacio");
		   }
	   }

	}

}
