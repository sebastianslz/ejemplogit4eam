package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

/**
 * Interface responsable de definir las operaciones del registro de un curso
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 15/09/2016<br/>
 */
public interface IDAORegistroCurso {

	/**
	 * Interface para crear el registro curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param registroCurso
	 */
	public void crear(RegistroCurso registroCurso);
	
	/**
	 * Metodo para listar los estudiantes por curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param curso, curso por el cual se realizara la consulta
	 * @return una lista de los registros de este curso
	 */
	
	public List<RegistroCurso> listarRegistroCursoPorCurso(Curso curso);
	
	/**
	 * Metodo para listar los estudiantes de un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param estudiante
	 * @return
	 */
	
	public List<RegistroCurso> listarEstudiantesPorCurso(Estudiante estudiante);
	
	/**
	 * Metodo para calcular el numero de creditos registrados por un estudiante
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param estudiante, estudiante que se le realizara la consulta
	 * @return el numero de creditos registrados
	 */
	
	public List<Long> calcularCreditosRegistradosPorEstudiante(Estudiante estudiante);
	
	/**
	 * Metodo para listar los cursos por estudiantes
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param estudiante, estudiante que se le realizara la consulta
	 * @return una lista de los registros del estudiante
	 */
	
	public List<RegistroCurso> listarRegistroCursoPorEstudiante(Estudiante estudiante);
	
	/**
	 * Interface para eliminar un registro curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param codigo
	 */
	public void eliminar(String codigo);
	
	/**
	 * Interface para buscar un registro curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param codigo
	 * @return
	 */
	public RegistroCurso buscar(String codigo);
}
