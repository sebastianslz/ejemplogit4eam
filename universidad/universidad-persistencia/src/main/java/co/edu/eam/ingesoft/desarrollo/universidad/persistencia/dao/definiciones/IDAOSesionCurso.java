package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.SesionCurso;

/**
 * Interface responsable de definir las operaciones de la sesion de un curso
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 13/09/2016<br/>
 */
public interface IDAOSesionCurso {

	/**
	 * Interface para crear una sesion de un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 13/09/2016<br/>
	 * @param sesionCurso
	 */
	public void crear(SesionCurso sesionCurso);
	
	/**
	 * Interface para editar una sesion de un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 13/09/2016<br/>
	 * @param sesionCurso
	 */
	public void editar(SesionCurso sesionCurso);
	
	/**
	 * Interface para eliminar una sesion de un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 16/09/2016<br/>
	 * @param id
	 */
	public void eliminar(long id);
	
	/**
	 * Interface para buscar una sesion de un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 16/09/2016<br/>
	 * @param id
	 * @return
	 */
	public SesionCurso buscar(long id);
	
	/**
	 * Interface para listar una sesion de un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 16/09/2016<br/>
	 * @return
	 */
	public List<SesionCurso> listarSesionCursoPorCurso(Curso curso);
}
