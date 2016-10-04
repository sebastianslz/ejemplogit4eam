package co.edu.eam.ingesoft.desarrollo.universidad.logica.bos;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAODocente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa.DAODocenteJPA;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;

public class BODocente {

	private IDAODocente daoDocente;
	
	public BODocente(){
		daoDocente = new DAODocenteJPA();
	}
	
	public Docente buscarDocente(String cedula) throws Exception{
		return daoDocente.buscar(cedula);
	}
	
	public void crearDocente(Docente docente) throws Exception{
		if(buscarDocente(docente.getCedula())==null){
			daoDocente.crear(docente);
		}else{
			throw new ExcepcionNegocio("El docente ya existe");
		}
	}
	
	public void editarDocente(Docente docente) throws Exception{
		daoDocente.editar(docente);
	}
	
	public void eliminarEstudiante(String cedula) throws Exception{
		daoDocente.eliminar(cedula);
	}
	
}
