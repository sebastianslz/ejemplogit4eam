/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Persona;

/**
 * Interface responsable de definir las operaciones de persona
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 8/08/2016<br/>
 */
public interface IDAOPersona {

	/**
	 * Interface para crear una persona
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param persona
	 */
	public void crear(Persona persona)  throws Exception;
	
	/**
	 * Interface para editar una persona
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param persona
	 */
	public void editar(Persona persona) throws Exception;
	
	/**
	 * Interface para eliminar una persona
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param cedula
	 */
	public void eliminar(String cedula);
	
	/**
	 * Interface para buscar una persona
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @param cedula
	 * @return
	 */
	public Persona buscar(String cedula) throws Exception;
	
	/**
	 * Interface para listar todas las personas
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 8/08/2016<br/>
	 * @return
	 */
	public List<Persona> listarPersonas() throws Exception;
	
	
}
