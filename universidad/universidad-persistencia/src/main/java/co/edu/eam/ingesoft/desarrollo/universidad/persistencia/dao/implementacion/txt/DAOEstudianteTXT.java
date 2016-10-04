package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.txt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOEstudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Persona;

public class DAOEstudianteTXT implements IDAOEstudiante{

	public void crear(Estudiante estudiante) throws Exception {
		// TODO Auto-generated method stub
		
		PrintWriter salida = new PrintWriter(new FileWriter("Estudiante.txt", true));
		salida.println(estudiante.getCedula()+";"+
				estudiante.getApellido()+";"+
				estudiante.getCorreo()+";"+
				estudiante.getDireccion()+";"+
				estudiante.getNombre()+";"+
				estudiante.getTelefono()+";"+
				estudiante.getFechaNacimiento());
		
		salida.close();
	}

	public void editar(Estudiante estudiante) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	public Estudiante buscar(String cedula) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new FileReader("Estudiante.txt"));
		
		String linea = null;
		while((linea=entrada.readLine())!=null){
			String data[]=linea.split(";");
			if(data[0].equals(cedula)){
				Estudiante e= new Estudiante();
				e.setCedula(data[0]);
				e.setApellido(data[1]);
				e.setCorreo(data[2]);
				e.setDireccion(data[3]);
				e.setNombre(data[4]);
				e.setTelefono(data[5]);
				//e.setFechaNacimiento(data[6]);
				return e;
			}
		}
		return null;
	}

	public List<Estudiante> listarEstudiantes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
