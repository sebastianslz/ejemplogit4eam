package co.edu.eam.ingesoft.desarrollo.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOEstudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BORegistroCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Estudiante;

public class ControladorRegistrarCurso {

	private BOEstudiante boEstudiante;
	private BOAsignatura boAsignatura;
	private BORegistroCurso boRegistroCurso;
	private BOCurso boCurso;
	
	public ControladorRegistrarCurso(){
		boEstudiante = new BOEstudiante();
		boAsignatura = new BOAsignatura();
		boRegistroCurso = new BORegistroCurso();
		boCurso = new BOCurso();
	}
	
	/**
	 * Metodo que busca un estudiante por su cedula
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 19/09/2016<br/>
	 * @param cedula
	 * @return
	 * @throws Exception
	 */
	public Estudiante buscarEstudiante(String cedula) throws Exception{
		return boEstudiante.buscarEstudiante(cedula);
	}
	
	/**
	 * Metodo que busca una asignatura por su codigo
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 19/09/2016<br/>
	 * @param codigo
	 * @return
	 * @throws Exception 
	 */
	public Asignatura buscarAsignatura(String codigo) throws Exception{
		return boAsignatura.buscarAsignatura(codigo);
	}
	
	/**
	 * Metodo para buscar un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param codigo
	 * @return, el curso si encuentra registrado
	 */
	public Curso buscarCurso(String codigo){
		return boCurso.buscarCurso(codigo);
	}
	
	/**
	 * Metodo para crear un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param curso, curso que se desea crear
	 * @param estudiante, estudiante del curso que se va a crear
	 * @throws Exception
	 */
	public void registrarCurso(Curso curso, Estudiante estudiante) throws Exception{
		boRegistroCurso.registrarCurso(curso, estudiante);
	}
	
	/**
	 * Metodo para calcular el numero de creditos registrados por un estudiante
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 19/09/2016<br/>
	 * @param e, estudiante al que se le realizara la consulta 
	 * @return, el numero de creditos registrados
	 */
	public List<Long> calcularCreditosRegistradoPorEstudiante(Estudiante e){
		return boRegistroCurso.consultarCreditosRegistradosPorEstudiante(e);
	}
	
	/**
	 * Metodo para listar los cursos de una asignatura 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 20/09/2016<br/>
	 * @param asignatura, asignatura con la que se realizara la consulta
	 * @return, una lista con los cursos de la asignatura
	 */
	public List<Curso> listarCursosPorAsignatura(Asignatura asignatura){
		return boCurso.listarCursosPorASignatura(asignatura);
	}
	
}
