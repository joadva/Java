package componentes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.mysql.jdbc.PreparedStatement;

public class CompConexion
{
   private Connection conexion;
   private Statement st;
   private ResultSet rs;
   private PreparedStatement pst;
   
   public CompConexion(String host,String baseDeDatos,String usuario,String password)
   {
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
         conexion=DriverManager.getConnection("jdbc:mysql://"+host+"/"+baseDeDatos,usuario,password);
         st=conexion.createStatement();
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,"Error al conectar:"+e.getMessage());
      }
   }
  
   
   public ResultSet consultar(String sql)
   {
      rs=null;
      
      try
      {
         rs=st.executeQuery(sql);
      }
      catch(SQLException e)
      {
         JOptionPane.showMessageDialog(null,"Error al consultar:"+e.getMessage());;
      }
      return rs;
   }
   public int ejecutar(String sql)
   {
      int resultado=0;
      try
      {
         resultado=st.executeUpdate(sql);
      }
      catch(SQLException e)
      {
         JOptionPane.showMessageDialog(null,"Error al ejecurtar:"+e.getMessage());
      }
      return resultado;
   }
   public void cerrar()
   {
      try
      {
         conexion.close();
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,"No se puede cerrar el archivo");
      }
   }
   public void eliminar(String sql,String eliminar)
   {
      try
      {
         st= conexion.createStatement();
         rs=st.executeQuery(sql);
         if(rs.next())
         {
            JOptionPane.showMessageDialog(null,"Eliminado");
            st.executeUpdate(eliminar);
         }
         else 
         {
            JOptionPane.showMessageDialog(null,"No se a eliminado");
         }
      }
      catch(SQLException e)
      {
         JOptionPane.showMessageDialog(null,e.getMessage());
      }
   }
}
