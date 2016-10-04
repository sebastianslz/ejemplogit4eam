package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase responsable de conectar la aplicacion a la BD
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 8/08/2016<br/>
 */
public class AdministradorConexionJDBC {

	public static Connection getConexion() throws SQLException{
		
		String url="jdbc:mysql://localhost:3306/universidad";
		String user="root";
		String password="1234";
		Connection con=DriverManager.getConnection(url, user, password);
		return con;
	}
	
}
