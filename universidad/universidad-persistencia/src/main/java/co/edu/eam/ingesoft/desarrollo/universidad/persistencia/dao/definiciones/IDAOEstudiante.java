package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Estudiante;

/**
 * Interface responsable de definir las operaciones del estudiante
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 9/08/2016<br/>
 */
public interface IDAOEstudiante {

	/**
	 * Interface para crear un estudiante
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 9/08/2016<br/>
	 * @param estudiante
	 * @throws Exception
	 */
	public void crear(Estudiante estudiante) throws Exception;
	
	/**
	 * Interface para editar un estudiante
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param persona
	 */
	public void editar(Estudiante estudiante) throws Exception;
	
	/**
	 * Interface para eliminar un estudiante
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param cedula
	 */
	public void eliminar(String cedula) throws Exception;
	
	/**
	 * Interface para buscar un estudiante
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param cedula
	 * @return
	 */
	public Estudiante buscar(String cedula) throws Exception;
	
	/**
	 * Interface para listar todas los estudiante
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @return
	 */
	public List<Estudiante> listarEstudiantes() throws Exception;

}
