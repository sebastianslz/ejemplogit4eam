package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones;



import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

/**
 * Interface repsonsable de definir las operaciones de una nota
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 29/09/2016<br/>
 */
public interface IDAONota {

	/**
	 * Interface para crear una nota
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param nota
	 */
	public void crear(Nota nota);
	
	/**
	 * Metodo que lista las notas de una evaluacion
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param evaluacion, 
	 * @param registroCurso
	 * @return una lista de evaluaciones
	 */
	public Nota listarNotasEvaluacion(Evaluacion evaluacion, RegistroCurso registroCurso);
	
	/**
	 * Interface para buscar una nota
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param id
	 * @return
	 */
	public Nota buscar(long id);
}
