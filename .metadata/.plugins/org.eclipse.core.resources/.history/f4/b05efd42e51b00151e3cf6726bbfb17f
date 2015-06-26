package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlDBConexion {

	/*public static Connection getConexion(){
		Connection cn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost/bd_consorcio","root","");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
		
	}*/
	// tenemos que registrar el driver de conexion
		// Este registro solo se tiene que hacer la  primera vez
		// que se invoque a esta clase (MySqlConexion)
		
		// Definimos un bloque estatico. Un bloque estatico solo
		// se ejecuta la primera vez que se invoca la clase
		static{
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		public static Connection getConexion(){
			
			Connection cn = null;
			
			try {
				
				cn = 
					DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/proyecto.lpii", 
							"root", 
							"mysql");
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
			return cn;
			
		}
	
	
}
