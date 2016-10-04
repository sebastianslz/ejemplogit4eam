package co.edu.eam.ingesoft.desarrollo.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BODocente;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOEvaluacion;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BONota;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BORegistroCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public class ControladorIngresarCalificaciones {

	private BODocente boDocente;
	private BOCurso boCurso;
	private BORegistroCurso boRegistroCurso;
	private BONota boNota;
	private BOEvaluacion boEvaluacion;
	
	public ControladorIngresarCalificaciones(){
		boDocente = new BODocente();
		boCurso = new BOCurso();
		boRegistroCurso = new BORegistroCurso();
		boNota = new BONota();
	}
	
	/**
	 * Metodo para buscar un docente
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param cedula, cedula por el que el docente se va a buscar
	 * @return, el docente
	 * @throws Exception
	 */
	public Docente buscarDocente(String cedula) throws Exception{
		return boDocente.buscarDocente(cedula);
	}
	
	/**
	 * Metodo que busca un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param codigo
	 * @return
	 */
	public Curso buscarCurso(String codigo){
		return boCurso.buscarCurso(codigo);
	}
	
	/**
	 * Metodo para listar los cursos de un docente
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param docente, docente por el cual se va a realizar la consulta
	 * @return, una lista de docentes
	 */
	public List<Curso> listarCursosPorDocente(Docente docente){
		return boCurso.listarCursosPorDocente(docente);
	}
	
	/**
	 * Metodo que lista los registros curso de un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param curso
	 * @return, una lista de los registros cursos
	 */
	public List<RegistroCurso> listarRegistrosCursos(Curso curso){
		return boRegistroCurso.listarRegistroCursoPorCurso(curso);
	}
	
	/**
	 * Metodo que lista las notas de una evaluacion
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param evaluacion
	 * @param registroCurso
	 * @return
	 */
	public Nota listaNotas(Evaluacion evaluacion, RegistroCurso registroCurso){
		return boNota.listarNotasEvaluacion(evaluacion, registroCurso);
	}
	
	/**
	 * Metodo que lista las evaluaciones de un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param curso
	 * @return una lista de evaluaciones
	 */
	public List<Evaluacion> listarEvaluaciones(Curso curso){
		return boEvaluacion.listarEvaluacionesPorCurso(curso);
	}
	
	/**
	 * Metodo para crear una nota de una evalucion
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param nota
	 * @throws ExcepcionNegocio
	 */
	public void crearNota(Nota nota) throws ExcepcionNegocio{
		boNota.crearNota(nota);
	}
	
	
	
}
