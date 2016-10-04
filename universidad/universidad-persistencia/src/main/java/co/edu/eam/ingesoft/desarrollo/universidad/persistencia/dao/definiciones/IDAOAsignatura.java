package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;

/**
 * Interface responsable de definir la operaciones de la asignatura
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 16/08/2016<br/>
 */
public interface IDAOAsignatura {
	
	/**
	 * Interface para crear una asignatura
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param asignatura
	 */
	public void crear(Asignatura asignatura)  throws Exception;
	
	/**
	 * Interface para editar una asignatura
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param asignatura
	 */
	public void editar(Asignatura asignatura) throws Exception;
	
	/**
	 * Interface para eliminar una asignatura
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param asignatura
	 */
	public void eliminar(String codigo) throws Exception;
	
	/**
	 * Interface para buscar una asignatura
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param codigo
	 * @return
	 */
	public Asignatura buscar(String codigo) throws Exception;
	
	/**
	 * Interface para listar todas las asignatura
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @return
	 */
	public List<Asignatura> listarAsignatura() throws Exception;
	
	
	

}
