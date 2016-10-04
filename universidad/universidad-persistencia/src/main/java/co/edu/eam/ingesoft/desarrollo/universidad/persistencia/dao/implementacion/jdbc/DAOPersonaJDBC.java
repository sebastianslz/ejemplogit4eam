package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOPersona;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Persona;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorConexionJDBC;

/**
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 9/08/2016<br/>
 */
public class DAOPersonaJDBC implements IDAOPersona {

	
	
	public void crear(Persona persona) throws Exception{
		// TODO Auto-generated method stub
		Connection con=AdministradorConexionJDBC.getConexion();
		
		String sql="INSERT INTO tb_persona (cedula_per, apellido_per, correo_per, direccion_per, nombre_per, telefono_per) "
				+ " VALUES(?,?,?,?,?,?) ";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, persona.getCedula());
		pstmt.setString(2, persona.getApellido());
		pstmt.setString(3, persona.getCorreo());
		pstmt.setString(4, persona.getDireccion());
		pstmt.setString(5, persona.getNombre());
		pstmt.setString(6, persona.getTelefono());
		
		
		//2.2 Ejecutar consulta
		pstmt.executeUpdate();
		
		//3 Cerrar la conexion
		con.close();
	}

	public void editar(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		Connection con=AdministradorConexionJDBC.getConexion();
		
		String sql="UPDATE tb_persona SET apellido_per=?, correo_per=?, direccion_per=?, nombre_per=?, telefono_per=? "
				+ " WHERE cedula_per=?";
		
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, persona.getApellido());
		pstmt.setString(2, persona.getCorreo());
		pstmt.setString(3, persona.getDireccion());
		pstmt.setString(4, persona.getNombre());
		pstmt.setString(5, persona.getTelefono());
		pstmt.setString(6, persona.getCedula());
		
		//2.2 Ejecutar consulta
		pstmt.executeUpdate();
		
		//3 Cerrar la conexion
		con.close();
		
	}

	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	public Persona buscar(String cedula) throws Exception{
		// TODO Auto-generated method stub
		Connection con=AdministradorConexionJDBC.getConexion();
		
		String sql="SELECT apellido_per, correo_per, direccion_per, nombre_per, telefono_per FROM tb_persona "
				+ " WHERE cedula_per=?";
		
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, cedula);
		//Ejecutar consulta
		ResultSet res = pstmt.executeQuery();
		//Hubo un registro
		if(res.next()){
			String apellido = res.getString(1);
			String correo = res.getString(2);
			String direccion = res.getString(3);
			String nombre = res.getString(4);
			String telefono = res.getString(5);
			
			Persona p = new Persona(nombre, apellido, cedula, correo, direccion, telefono);
			con.close();
			return p;
			
			
		}else{
			con.close();
			return null;
		}
		
		
		
	}

	public List<Persona> listarPersonas() throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = AdministradorConexionJDBC.getConexion();
		List<Persona> lista = new ArrayList<Persona>();
		
		String sql="SELECT apellido_per, correo_per, direccion_per, nombre_per, telefono_per, cedula_per FROM tb_persona";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		ResultSet res= pstmt.executeQuery();
		
		while(res.next()){
			String apellido = res.getString(1);
			String correo = res.getString(2);
			String direccion = res.getString(3);
			String nombre = res.getString(4);
			String telefono = res.getString(5);
			String cedula = res.getString(6);
			
			Persona p = new Persona(nombre, apellido, cedula, correo, direccion, telefono);
			lista.add(p);
		}
		con.close();
		return lista;
	}

	
	
}
