package NuevosComp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CompConexion 
{
	public Connection conection = null;
	private Statement cmd = null;
	private ResultSet rs = null;

	public CompConexion(String pBaseDeDatos,String pUsuario,String pContraseña) 
	{
		try
	      {
	         Class.forName("com.mysql.jdbc.Driver").newInstance();
	         //JOptionPane.showMessageDialog(null,"conexion exitosa");
	      }catch(Exception e)
	      {
	         JOptionPane.showMessageDialog(null,"Se ha producido un error");
	      }
	      
	      try
	      {
	         conection=DriverManager.getConnection("jdbc:mysql://localhost/"+pBaseDeDatos+"?"+
	                                               "user="+pUsuario+"&password="+pContraseña);
	         //JOptionPane.showMessageDialog(null, "Encontro la base de datos");
	      }catch(Exception e)
	      {
	         JOptionPane.showMessageDialog(null,"No se encuetra la base de datos");
	      }
	}

}
