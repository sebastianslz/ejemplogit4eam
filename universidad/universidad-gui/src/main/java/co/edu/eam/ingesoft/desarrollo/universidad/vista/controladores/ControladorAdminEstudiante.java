package co.edu.eam.ingesoft.desarrollo.universidad.vista.controladores;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOEstudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Estudiante;

public class ControladorAdminEstudiante {

	private BOEstudiante boEstudiante;
	
	public ControladorAdminEstudiante(){
		boEstudiante = new BOEstudiante();
	}
	
	public void crearEstudiante (Estudiante estudiante) throws Exception{
		boEstudiante.crearEstudiante(estudiante);
	}
	
	public Estudiante buscarEstudiante(String cedula) throws Exception{
		return boEstudiante.buscarEstudiante(cedula);
	}
	
	public void editarEstudiante (Estudiante estudiante) throws Exception{
		boEstudiante.editarEstudiante(estudiante);
	}
	
	public void eliminarEstudiante (String cedula) throws Exception{
		boEstudiante.eliminarEstudiante(cedula);
	}
}
