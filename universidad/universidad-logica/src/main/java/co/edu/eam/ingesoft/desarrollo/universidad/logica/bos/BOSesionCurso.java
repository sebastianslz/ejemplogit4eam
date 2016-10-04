package co.edu.eam.ingesoft.desarrollo.universidad.logica.bos;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOSesionCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa.DAOSesionCursoJPA;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.SesionCurso;

public class BOSesionCurso {

	private IDAOSesionCurso daoSesionCurso;
	
	public BOSesionCurso(){
		daoSesionCurso = new DAOSesionCursoJPA();
	}
	
	public SesionCurso buscarSesionCurso(long id){
		return daoSesionCurso.buscar(id);
	}
	
	public void crearSesionCurso(SesionCurso sesionCurso){
		daoSesionCurso.crear(sesionCurso);
	}
	
	public void editarSesionCurso(SesionCurso sesionCurso){
		daoSesionCurso.editar(sesionCurso);
	}
	
	public void eliminarSesionCurso(long id){
		daoSesionCurso.eliminar(id);
	}
	
	/**
	 * Metodo para listar las sesiones un curso
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param curso, curso al cual se le hara la consulta
	 * @return, las sesiones del curso
	 */
	public List<SesionCurso> listarSesionesCursoPorCurso(Curso curso){
		return daoSesionCurso.listarSesionCursoPorCurso(curso);
	}
	
}
