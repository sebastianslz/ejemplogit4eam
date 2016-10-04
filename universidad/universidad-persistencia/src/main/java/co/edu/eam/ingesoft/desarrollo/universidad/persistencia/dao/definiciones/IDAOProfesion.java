/**
 * 
 */
package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Profesion;

/**
 * Interface responsable de definir las operaciones de la profesion
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 9/08/2016<br/>
 */
public interface IDAOProfesion {

	public List<Profesion> listarProfesion() throws Exception;
}
