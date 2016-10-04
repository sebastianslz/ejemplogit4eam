package co.edu.eam.ingesoft.desarrollo.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOEstudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BORegistroCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOSesionCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.SesionCurso;

public class ControladorVerRegistroEstudiante {

	private BOEstudiante boEstudiante;
	private BOSesionCurso boSesionCurso;
	private BORegistroCurso boRegistroCurso;
	
	public ControladorVerRegistroEstudiante(){
		boEstudiante = new BOEstudiante();
		boSesionCurso = new BOSesionCurso();
		boRegistroCurso = new BORegistroCurso();
	}
	
	/**
	 * Metodo que busca un estudiante por su cedula
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param cedula
	 * @return
	 * @throws Exception
	 */
	public Estudiante buscarEstudiante(String cedula) throws Exception{
		return boEstudiante.buscarEstudiante(cedula);
	}
	
	/**
	 * Metodo que lista las sesiones de un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param curso, es el parametro por el cual se va a listar
	 * @return, una lista de sesiones
	 */
	public List<SesionCurso> listarSesiones(Curso curso){
		return boSesionCurso.listarSesionesCursoPorCurso(curso);
	}
	
	/**
	 * Metodo que lista registros de un estudiante
	 *  
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param estudiante, es el parametro por el cual se va a listar
	 * @return, una lista de registro cursos
	 */
	public List<RegistroCurso> listarRegistrosEstudiante(Estudiante estudiante){
		return boRegistroCurso.listarRegistroCursoPorEstudiante(estudiante);
	}
	
	/**
	 * Metodo para calcular el numero de creditos registrados por un estudiante
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param e
	 * @return
	 */
	public List<Long> calcularCreditosRegistradoPorEstudiante(Estudiante e){
		return boRegistroCurso.consultarCreditosRegistradosPorEstudiante(e);
	}
	
	/**
	 * Metodo para eliminar un registro curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param codigo, codigo del curso a eliminar
	 */
	public void eliminarCurso(String codigo){
		boRegistroCurso.eliminarRegistroCurso(codigo);
	}
}
