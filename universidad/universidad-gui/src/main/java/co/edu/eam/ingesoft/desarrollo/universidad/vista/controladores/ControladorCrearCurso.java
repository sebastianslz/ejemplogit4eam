package co.edu.eam.ingesoft.desarrollo.universidad.vista.controladores;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BODocente;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOSesionCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.SesionCurso;

/**
 * Clase responsable de controlador la ventana de crear curso
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 14/09/2016<br/>
 */
public class ControladorCrearCurso {

	private BOAsignatura boAsignatura;
	private BODocente boDocente;
	private BOCurso boCurso;
	private BOSesionCurso boSesionCurso;
	
	public ControladorCrearCurso(){
		boAsignatura = new BOAsignatura();
		boDocente = new BODocente();
		boCurso = new BOCurso();
		boSesionCurso = new BOSesionCurso();
		
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
	 * Metodo que busca un docente por su cedula
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param cedula, cedula del docente
	 * @return, el docente
	 * @throws Exception
	 */
	public Docente buscarDocente(String cedula) throws Exception{
		return boDocente.buscarDocente(cedula);
	}
	
	/**
	 * Metodo que busca un curso por su codigo
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param codigo, codigo del curso
	 * @return el curso
	 */
	public Curso buscarCurso(String codigo){
		return boCurso.buscarCurso(codigo);
	}
	
	/**
	 * Metodo para crear un curso
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param curso
	 */
	public void crearCurso(Curso curso){
		boCurso.crearCurso(curso);
	}
	
	/**
	 * Metodo para editar un curso
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 15/09/2016<br/>
	 * @param curso
	 */
	public void editarCurso(Curso curso){
		boCurso.editarCurso(curso);
	}
	
	/**
	 * Metodo para crear la sesion de un curso
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 18/09/2016<br/>
	 * @param sesionCurso
	 */
	public void crearSesionCurso(SesionCurso sesionCurso){
		boSesionCurso.crearSesionCurso(sesionCurso);
	}
	
	/**
	 * Metodo para buscar la sesion de un curso
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 19/09/2016<br/>
	 * @param id
	 * @return
	 */
	public SesionCurso buscarSesionCurso(long id){
		return boSesionCurso.buscarSesionCurso(id);
	}
	
	
}
