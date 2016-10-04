package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.txt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAODocente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Profesion;

public class DAODocenteTXT implements IDAODocente{

	public void crear(Docente docente) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter salida = new PrintWriter(new FileWriter("Docente.txt", true));
		salida.println(docente.getCedula()+";"+
				docente.getApellido()+";"+
				docente.getCorreo()+";"+
				docente.getDireccion()+";"+
				docente.getNombre()+";"+
				docente.getTelefono()+";"+
				docente.getProfesion()+";"+
				docente.isPostgrado());
		
		salida.close();
		
	}

	public void editar(Docente docente) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	public Docente buscar(String cedula) throws Exception {
		// TODO Auto-generated method stub
		
	BufferedReader entrada = new BufferedReader(new FileReader("Docente.txt"));
		
		String linea = null;
		while((linea=entrada.readLine())!=null){
			String data[]=linea.split(";");
			if(data[0].equals(cedula)){
				Docente d= new Docente();
				d.setCedula(data[0]);
				d.setApellido(data[1]);
				d.setCorreo(data[2]);
				d.setDireccion(data[3]);
				d.setNombre(data[4]);
				d.setTelefono(data[5]);
				Profesion profesion = new Profesion();
				profesion.setCodigo(data[6]);
				//boolean postgrado = d.setPostgrado(data[7]);
				return d;
			}
		}
		return null;
	}
		
		
	

	public List<Docente> listarDocentes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
