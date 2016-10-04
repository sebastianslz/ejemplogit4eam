package co.edu.eam.ingesoft.desarrollo.universidad.vista.controladores;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BODocente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;

public class ControladorProfesor {
	
	private BODocente boDocente;
	
	public ControladorProfesor(){
		boDocente = new BODocente();
	}
	
	public void crearDocente (Docente docente) throws Exception{
		boDocente.crearDocente(docente);
	}
	
	public Docente buscarDocente (String cedula) throws Exception{
		return boDocente.buscarDocente(cedula);
	}
	
	public void editarDocente(Docente docente) throws Exception{
		boDocente.editarDocente(docente);
	}
	
	public void eliminarDocente(String cedula) throws Exception{
		boDocente.eliminarEstudiante(cedula);
	}

}
