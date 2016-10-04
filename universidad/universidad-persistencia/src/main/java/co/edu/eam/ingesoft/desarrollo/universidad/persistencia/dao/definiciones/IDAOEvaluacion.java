package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Evaluacion;

/**
 * Interface responsable de definir las operaciones de una evaluacion
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 27/09/2016<br/>
 */
public interface IDAOEvaluacion {

	/**
	 * Interface para crear una evaluacion
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param evaluacion
	 */
	public void crear(Evaluacion evaluacion);
	
	/**
	 * Interface para eliminar una evaluacion
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param id
	 */
	public void eliminar(long id);
	
	/**
	 * Interface para buscar una evaluacion
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param id
	 * @return
	 */
	public Evaluacion buscar(long id);
	
	/**
	 * Metodo que lista las evaluaciones del curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param curso, curso de una evaluacion
	 * @return, una lista de cursos
	 */
	public List<Evaluacion> listarEvaluacionesPorCurso(Curso curso);
}
