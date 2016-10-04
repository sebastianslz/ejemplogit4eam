package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;

/**
 * Interface responsable de definir las operaciones del docente
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 9/08/2016<br/>
 */
public interface IDAODocente {

	/**
	 * Interface para crear un docente
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param persona
	 */
	public void crear(Docente docente)  throws Exception;
	
	/**
	 * Interface para editar un docente
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param persona
	 */
	public void editar(Docente docente) throws Exception;
	
	/**
	 * Interface para eliminar un docente
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param cedula
	 */
	public void eliminar(String cedula) throws Exception;
	
	/**
	 * Interface para buscar un docente
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param cedula
	 * @return
	 */
	public Docente buscar(String cedula) throws Exception;
	
	/**
	 * Interface para listar todas los docentes
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @return
	 */
	public List<Docente> listarDocentes() throws Exception;
	
	
	
}
