package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;

/**
 * Interface responsable de definir las operaciones de un curso
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 15/09/2016<br/>
 */
public interface IDAOCurso {

	/**
	 * Interface para crear un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param curso
	 */
	public void crear(Curso curso);
	
	/**
	 * Interface para editar un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param curso
	 */
	public void editar(Curso curso);
	
	/**
	 * Interface para eliminar un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param codigo
	 */
	public void eliminar(String codigo);
	
	/**
	 * Interface para buscar un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param codigo
	 * @return
	 */
	public Curso buscar(String codigo);
	
	/**
	 * Interface para listar todos los cursos
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @return
	 */
	public List<Curso> listarCursos();
	
	/**
	 * Interface para listar los cursos por asignatura
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 20/09/2016<br/>
	 * @param asignatura, asignatura por la que se van a listar los cursos
	 * @return, una lista con los cursos de la asignatura
	 */
	public List<Curso> listarCursosPorAsignatura(Asignatura asignatura);
	
	/**
	 * Interface para listar los cursos por docente
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param docente, docente por el se van a listar los cursos
	 * @return, una lista con los cursos del docente
	 */
	public List<Curso> listarCursoPorDocente(Docente docente);
}
