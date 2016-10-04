package co.edu.eam.ingesoft.desarrollo.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOEvaluacion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Evaluacion;

/**
 * Clase responsable de controlar la ventana de crear calificacion
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 22/09/2016<br/>
 */
public class ControladorCrearCalificacion {

	private BOAsignatura boAsignatura;
	private BOCurso boCurso;
	private BOEvaluacion boEvaluacion;
	
	public ControladorCrearCalificacion(){
		boAsignatura = new BOAsignatura();
		boCurso = new BOCurso();
		boEvaluacion = new BOEvaluacion();
	}
	
	/**
	 * Metodo que busca una asignatura por su codigo
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 22/09/2016<br/>
	 * @param codigo
	 * @return
	 * @throws Exception 
	 */
	public Asignatura buscarAsignatura(String codigo) throws Exception{
		return boAsignatura.buscarAsignatura(codigo);
	}
	
	/**
	 * Metodo para buscar un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param codigo, codigo del curso a buscar
	 * @return
	 */
	public Curso buscarCurso(String codigo){
		return boCurso.buscarCurso(codigo);
	}
	
	/**
	 * Metodo para listar las asignaturas por curso
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 22/09/2016<br/>
	 * @param asignatura
	 * @return
	 */
	public List<Curso> listarCursosPorAsignatura(Asignatura asignatura){
		return boCurso.listarCursosPorASignatura(asignatura);
	}
	
	/**
	 * Metodo que lista las evaluaciones por curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param curso
	 * @return
	 */
	public List<Evaluacion> listarEvaluacionPorCurso(Curso curso){
		return boEvaluacion.listarEvaluacionesPorCurso(curso);
	}
	
	/**
	 * Metodo que crea una evaluacion
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param evaluacion
	 * @throws Exception
	 */
	public void crearEvaluacion(Evaluacion evaluacion) throws Exception{
		boEvaluacion.crearEvaluacion(evaluacion);
	}
	
	/**
	 * Metodo para eliminar una evaluacion
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param id
	 */
	public void eliminarEvaluacion(long id){
		boEvaluacion.eliminarEvaluacion(id);
	}
	
	
	
	
}
