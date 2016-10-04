package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAODocente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorConexionJDBC;

public class DAODocenteJDBC implements IDAODocente {

	public void crear(Docente docente) throws Exception {
		// TODO Auto-generated method stub
		Connection con=AdministradorConexionJDBC.getConexion();
		
		PreparedStatement pstmt_persona = con.prepareStatement("INSERT INTO tb_persona "
                + " (cedula_per,nombre_per,apellido_per,telefono_per,direccion_per,correo_per) VALUES(?,?,?,?,?,?) ");
		
		PreparedStatement pstmt_docente = con.prepareStatement("INSERT INTO tb_docente "
                + " (cedula_per,postgrado_doc,profesion_doc) values(?,?,?)");
		
		pstmt_persona.setString(1, docente.getCedula());
		pstmt_persona.setString(2, docente.getNombre());
		pstmt_persona.setString(3, docente.getApellido());
		pstmt_persona.setString(4, docente.getTelefono());
		pstmt_persona.setString(5, docente.getDireccion());
		pstmt_persona.setString(6, docente.getCorreo());
		pstmt_docente.setString(1, docente.getCedula());
		pstmt_docente.setBoolean(2, docente.isPostgrado());
		pstmt_docente.setString(3, docente.getProfesion().getCodigo());
		
		//2.2 Ejecutar consulta
		pstmt_persona.executeUpdate();
		pstmt_docente.executeUpdate();
		
		//3 Cerrar la conexion
		con.close();
		
	}

	public void editar(Docente docente) throws Exception {
		// TODO Auto-generated method stub
		Connection con=AdministradorConexionJDBC.getConexion();
		
		PreparedStatement pstmt_persona = con.prepareStatement("UPDATE tb_persona SET apellido_per=?, correo_per=?, direccion_per=?, nombre_per=?, telefono_per=? "
				+ " WHERE cedula_per=?");
		PreparedStatement pstmt_docente = con.prepareStatement("UPDATE tb_docente SET postgrado_doc=?, profesion_doc=? "
				+ " WHERE cedula_per=?");
		
		pstmt_persona.setString(4, docente.getNombre());
		pstmt_persona.setString(1, docente.getApellido());
		pstmt_persona.setString(5, docente.getTelefono());
		pstmt_persona.setString(3, docente.getDireccion());
		pstmt_persona.setString(2, docente.getCorreo());
		pstmt_docente.setBoolean(1, docente.isPostgrado());
		pstmt_docente.setString(2, docente.getProfesion().getCodigo());
		pstmt_persona.setString(6, docente.getCedula());
		pstmt_docente.setString(3, docente.getCedula());
		
		pstmt_docente.executeUpdate();
		pstmt_persona.executeUpdate();
		
		//3 Cerrar la conexion
		con.close();
		
		
	}

	public void eliminar(String cedula) throws Exception {
		// TODO Auto-generated method stub
		Connection con=AdministradorConexionJDBC.getConexion();
		
		PreparedStatement pstmt_docente = con.prepareStatement("DELETE FROM tb_docente WHERE cedula_per=? ");
		PreparedStatement pstmt_persona = con.prepareStatement("DELETE FROM tb_persona WHERE cedula_per=? ");
			
		pstmt_docente.setString(1, cedula);
		pstmt_persona.setString(1, cedula);
		
		pstmt_docente.executeUpdate();
		pstmt_persona.executeUpdate();
		
		con.close();
		
	}

	public Docente buscar(String cedula) throws Exception {
		// TODO Auto-generated method stub
		Connection con=AdministradorConexionJDBC.getConexion();
		
		PreparedStatement pstmt_docente = con.prepareStatement("SELECT apellido_per, correo_per, direccion_per, nombre_per, telefono_per, postgrado_doc, profesion_doc "
                + " FROM tb_docente d JOIN tb_persona p ON p.cedula_per=d.cedula_per JOIN tb_profesion pr ON d.profesion_doc=pr.codigo_prof WHERE p.cedula_per=? ");
                
        pstmt_docente.setString(1, cedula);
        
      //Ejecutar consulta
        ResultSet resDocente = pstmt_docente.executeQuery();
        
        if(resDocente.next()){
        	
        	String apellido = resDocente.getString(1);
        	String correo = resDocente.getString(2);
        	String direccion = resDocente.getString(3);
        	String nombre = resDocente.getString(4);
        	String telefono = resDocente.getString(5);
        	Profesion profesion = new Profesion();
        	String p = resDocente.getString(7);
        	profesion.setCodigo(p);
        	boolean postgrado=resDocente.getBoolean(6);
        	
        	
        	
        	//Docente d = new Docente();
            //d.setNombre(resDocente.getString(4));
            //d.setApellido(resDocente.getString(1));
            //d.setTelefono(resDocente.getString(5));
            //d.setDireccion(resDocente.getString(3));
            //d.setCorreo(resDocente.getString(2));   
            //d.setPostgrado(resDocente.getBoolean(6));
            
        	Docente d = new Docente(nombre, apellido, cedula, correo, direccion, telefono, profesion, postgrado);
        	
            //3 Cerrar la conexion
            con.close();
            return d;
            
        }else{
        	con.close();
    		return null;

        }        
  	}

	public List<Docente> listarDocentes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
