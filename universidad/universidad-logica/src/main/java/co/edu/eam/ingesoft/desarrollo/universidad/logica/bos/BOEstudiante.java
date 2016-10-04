package co.edu.eam.ingesoft.desarrollo.universidad.logica.bos;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOEstudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa.DAOEstudianteJPA;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Estudiante;

public class BOEstudiante {

	private IDAOEstudiante daoEstudiante;
	
	public BOEstudiante(){
		daoEstudiante = new DAOEstudianteJPA();
	}
	
	public void crearEstudiante (Estudiante estudiante) throws Exception{
		if(buscarEstudiante(estudiante.getCedula())==null){
			daoEstudiante.crear(estudiante);
		}else{
			throw new ExcepcionNegocio("El estudiante ya existe");
		}
	}
	
	public Estudiante buscarEstudiante(String cedula) throws Exception{
		return daoEstudiante.buscar(cedula);
	}
	
	public void editarEstudiante (Estudiante estudiante) throws Exception{
		daoEstudiante.editar(estudiante);
	}
	
	public void eliminarEstudiante (String cedula) throws Exception{
		daoEstudiante.eliminar(cedula);
	}
	
}
