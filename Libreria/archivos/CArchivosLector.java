package archivos;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class CArchivosLector
{
   private String         nombre;
   private BufferedReader br;
   
   public CArchivosLector(String pNombre)
   {
      nombre=pNombre;
      try
      {
         if(nombre==null) throw new Exception("LECTOR:El archivo no puede ser null");
         if(nombre.isEmpty()) throw new Exception("LECTOR:Es necesario poner nombre de archivo");
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,e.getMessage());
      }
   }
   
   public boolean abrir()
   {
      boolean abierto=false;
      try
      {
         br=new BufferedReader(new FileReader(nombre));
         abierto=true;
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,"LECTOR:el archivo no existe:"+nombre);
      }
      return abierto;
   }
   
   public void cerrar()
   {
      try
      {
         br.close();
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,"LECTOR:No se pudo cerrar el archivo");
      }
   }
   
   public String lectorLinea()
   {
      String linea="";
      try
      {
         linea=br.readLine();
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,"LECTOR:Error al leer el linea");
      }
      return linea;
   }
   
   public int lectorNumero()
   {
      int numero=Integer.parseInt(lectorLinea());
      return numero;
   }
   
   public double lectorDouble()
   {
      double doble=Double.parseDouble(lectorLinea());
      return doble;
   }
   
   public String lectorTodo()
   {
      String texto="",linea;
      while((linea=lectorLinea())!=null)
      {
         texto+=linea+"\n";
      }
      return texto;
   }
   public void mostrar()
   {
      try
      {
        Desktop.getDesktop().open(new File(nombre));;
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,"No se puede mostrar el archivo"+nombre);
      }
   }
   public void copiar(String Temp)
   {
      CArchivosEscritor escritor=new CArchivosEscritor(Temp,ETipo.SOBREESCRIBIR);
      if(escritor.crear())
      {
         String linea="";
         while((linea=lectorLinea())!=null)
         {
            escritor.escritorLinea(linea,true);
         }
         escritor.cerrar();
      }
   }
}
