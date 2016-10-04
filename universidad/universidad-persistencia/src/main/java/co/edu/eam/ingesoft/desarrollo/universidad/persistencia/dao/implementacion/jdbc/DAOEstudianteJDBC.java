/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOEstudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorConexionJDBC;

/**
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 9/08/2016<br/>
 */
public class DAOEstudianteJDBC implements IDAOEstudiante {

	public void crear(Estudiante estudiante) throws Exception {
		// TODO Auto-generated method stub
		Connection con=AdministradorConexionJDBC.getConexion();
		
		PreparedStatement pstmt_persona = con.prepareStatement("INSERT INTO tb_persona "
                + " (cedula_per,nombre_per,apellido_per,telefono_per,direccion_per,correo_per) VALUES(?,?,?,?,?,?) ");
		PreparedStatement pstmt_estudiante = con.prepareStatement("INSERT INTO tb_estudiante "
				+ " (cedula_per, fechanacimiento_est) VALUES(?,?) ");
		
		java.sql.Date fsql = new java.sql.Date(estudiante.getFechaNacimiento().getTime());
		
		pstmt_persona.setString(1, estudiante.getCedula());
		pstmt_persona.setString(2, estudiante.getNombre());
		pstmt_persona.setString(3, estudiante.getApellido());
		pstmt_persona.setString(4, estudiante.getTelefono());
		pstmt_persona.setString(5, estudiante.getDireccion());
		pstmt_persona.setString(6, estudiante.getCorreo());
		pstmt_estudiante.setString(1, estudiante.getCedula());
		pstmt_estudiante.setDate(2, fsql);
		
		//2.2 Ejecutar consulta
		pstmt_persona.executeUpdate();
		pstmt_estudiante.executeUpdate();
		
		//3 Cerrar la conexion
		con.close();
	}

	public void editar(Estudiante estudiante) throws Exception {
		// TODO Auto-generated method stub
		Connection con=AdministradorConexionJDBC.getConexion();
		
		PreparedStatement pstmt_persona = con.prepareStatement("UPDATE tb_persona SET apellido_per=?, correo_per=?, direccion_per=?, nombre_per=?, telefono_per=? "
				+ " WHERE cedula_per=?");
		PreparedStatement pstmt_estudiante = con.prepareStatement("UPDATE tb_estudiante SET fechanacimiento_est=? "
				+ " WHERE cedula_per=?");
		
		java.sql.Date fsqld = new java.sql.Date(estudiante.getFechaNacimiento().getTime());
		
		pstmt_persona.setString(4, estudiante.getNombre());
		pstmt_persona.setString(1, estudiante.getApellido());
		pstmt_persona.setString(5, estudiante.getTelefono());
		pstmt_persona.setString(3, estudiante.getDireccion());
		pstmt_persona.setString(2, estudiante.getCorreo());
		pstmt_persona.setString(6, estudiante.getCedula());
		pstmt_estudiante.setDate(1, fsqld);
		pstmt_estudiante.setString(2, estudiante.getCedula());
		
		pstmt_estudiante.executeUpdate();
		pstmt_persona.executeUpdate();
		
		//3 Cerrar la conexion
		con.close();
		
		
	}

	public void eliminar(String cedula) throws Exception {
		// TODO Auto-generated method stub
		Connection con=AdministradorConexionJDBC.getConexion();
		
		PreparedStatement pstmt_estudiante = con.prepareStatement("DELETE FROM tb_estudiante WHERE cedula_per=? ");
		PreparedStatement pstmt_persona = con.prepareStatement("DELETE FROM tb_persona WHERE cedula_per=? ");
		
		pstmt_estudiante.setString(1, cedula);
		pstmt_persona.setString(1, cedula);
		
		pstmt_estudiante.executeUpdate();
		pstmt_persona.executeUpdate();
		
		con.close();
		
	}

	public Estudiante buscar(String cedula) throws Exception {
		// TODO Auto-generated method stub
		Connection con=AdministradorConexionJDBC.getConexion();
		
		PreparedStatement pstmt_estudiante = con.prepareStatement("SELECT apellido_per, correo_per, direccion_per, nombre_per, telefono_per, fechanacimiento_est "
                + " FROM tb_estudiante e JOIN tb_persona p ON e.cedula_per=p.cedula_per WHERE p.cedula_per=? ");
		
		pstmt_estudiante.setString(1, cedula);
		
		//Ejecutar consulta
        ResultSet resEstudiante = pstmt_estudiante.executeQuery();
        
        if(resEstudiante.next()){
        	
        	String apellido = resEstudiante.getString(1);
        	String correo = resEstudiante.getString(2);
        	String direccion = resEstudiante.getString(3);
        	String nombre = resEstudiante.getString(4);
        	String telefono = resEstudiante.getString(5);
        	Date fechaNacimiento = resEstudiante.getDate(6);
        	
        	Estudiante e = new Estudiante(nombre, apellido, cedula, correo, direccion, telefono, fechaNacimiento);
        	
        	//3 Cerrar la conexion
            con.close();
            return e;
        
        }else{
        	con.close();
        	return null;
        }
	}

	public List<Estudiante> listarEstudiantes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
