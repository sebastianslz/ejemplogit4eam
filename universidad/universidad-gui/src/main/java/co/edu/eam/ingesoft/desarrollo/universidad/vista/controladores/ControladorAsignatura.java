package co.edu.eam.ingesoft.desarrollo.universidad.vista.controladores;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;

/**
 * Clase responsable de controlar la ventana de asignatura
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 15/09/2016<br/>
 */
public class ControladorAsignatura {

	private BOAsignatura boAsignatura;
	
	public ControladorAsignatura(){
		boAsignatura = new BOAsignatura();
	}
	
	/**
	 * Metodo que busca una asignatura por su codigo
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param codigo, el codigo de la asignatura a buscar
	 * @return, la asignatura
	 * @throws Exception
	 */
	public Asignatura buscarAsignatura(String codigo) throws Exception{
		return boAsignatura.buscarAsignatura(codigo);
	}
	
	/**
	 * Metodo para crear una asignatura
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param asignatura
	 * @throws Exception
	 */
	public void crearAsignatura(Asignatura asignatura) throws Exception{
		boAsignatura.crearAsignatura(asignatura);
	}
	
	/**
	 * Metodo para editar una asignatura
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param asignatura
	 * @throws Exception
	 */
	public void editarAsignatura(Asignatura asignatura) throws Exception{
		boAsignatura.editarAsignatura(asignatura);
	}
	
	/**
	 * Metodo para eliminar una asignatura
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param codigo
	 * @throws Exception
	 */
	public void eliminarAsignatura(String codigo) throws Exception{
		boAsignatura.eliminarAsignatura(codigo);
	}
	
}
