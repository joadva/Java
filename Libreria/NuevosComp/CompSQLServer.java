package NuevosComp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CompSQLServer 
{
	public Connection con=null;
	public CompSQLServer(String pHost,String DataBase ,String UserName, String Password)
	{
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection("jdbc:sqlserver://"+ pHost +":1433;databaseName="+DataBase,UserName,Password);
			//JOptionPane.showMessageDialog(null, "Conexion conseguida");
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Conexion no conseguida");
		}
	}
}
