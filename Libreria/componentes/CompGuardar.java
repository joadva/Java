package componentes;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CompGuardar extends JFrame
{
   private String  FilePath;
   private String  FileContent;
   private boolean CrealFileContent;
   
   public CompGuardar(JPanel pPie, String PString, boolean PB)
  {
     this ("","");
  }
   
   public CompGuardar(String pFilePath,String pFileContent)
   {
      FilePath=pFilePath;
      FileContent=pFileContent;
      SaveFile(FilePath, FileContent, CrealFileContent);
   }
   
   public boolean SaveFile(String FilePath,String FileContent,boolean CleanFileContent)
   {
     
      FileWriter file;
      BufferedWriter writer;
      try
      {
         file=new FileWriter(FilePath,!CleanFileContent);
         writer=new BufferedWriter(file);
         writer.write(FileContent,0,FileContent.length());
         writer.close();
         file.close();
         return true;
      }
      catch(IOException ex)
      {
         ex.printStackTrace();
      }
      return false;
      
   }
}
