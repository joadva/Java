package archivos;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class CArchivosEscritor
{
   private String         nombre;
   private ETipo          tipo;
   private BufferedWriter bW;
   private boolean nuevaLinea=false;
   
   public CArchivosEscritor(String pNombre, ETipo pTipo)
   {
      nombre=pNombre;
      tipo=pTipo;
      try
      {
         if(nombre==null)     throw new Exception("ESCRITOR:El archivo no puede ser null");
         if(nombre.isEmpty()) throw new Exception("ESCRITOR:Es necesario poner nombre del archivo");
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,e.getMessage());
      }
   }
   
   public boolean crear()
   {
      boolean creado=false;
      try
      {
         bW=new BufferedWriter(new FileWriter(nombre,tipo==ETipo.AGREGAR));
         creado=true;
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,"ESCRITOR:No se pudo crear el archivo");
      }
      return creado;
   }
   public void cerrar()
   {
      try
      {
         bW.close();
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,"ESCRITOR:No se pudo cerrar el archivo");
      }
   }
   public void saltoDeLinea()
   {
      try
      {
         bW.newLine();
      }
      catch(IOException e)
      {
         e.printStackTrace();
      }
   }
   public void escritorLinea(String linea)
   {
      escritorLinea(linea,false);
   }
   public void escritorLinea(String linea,boolean nuevaLinea)
   {
      try
      {
         if(tipo==ETipo.SOBREESCRIBIR)bW.write (linea);
         else                         bW.append(linea);
         if(nuevaLinea)bW.newLine();
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,"ESCRITOR:Error al escribir en el archivo");
      }
   }
   public void escritorEntero(int entero)
   {
      escritorLinea(""+entero);
   }
   public void escritorDoble(double doble)
   {
      escritorLinea(""+doble);
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
}
