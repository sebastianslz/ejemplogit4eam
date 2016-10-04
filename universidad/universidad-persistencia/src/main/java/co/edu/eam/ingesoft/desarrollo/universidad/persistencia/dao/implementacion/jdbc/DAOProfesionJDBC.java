/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOProfesion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorConexionJDBC;

/**
 * 
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 9/08/2016<br/>
 */
public class DAOProfesionJDBC implements IDAOProfesion {

	public List<Profesion> listarProfesion() throws Exception {
		// TODO Auto-generated method stub
		Connection con= AdministradorConexionJDBC.getConexion();
		List <Profesion> lista = new ArrayList<Profesion>();
		String sql = "SELECT codigo_prof, nombre_prof FROM tb_profesion";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		ResultSet res=pstmt.executeQuery();
		
		while(res.next()){
			String codigo=res.getString(1);
			String nombre=res.getString(2);
			Profesion p = new Profesion(codigo, nombre);
			lista.add(p);
		}
		con.close();
		return lista;
	}

	
}
