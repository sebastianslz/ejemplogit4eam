package co.edu.eam.ingesoft.desarrollo.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BORegistroCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public class ControladorVerCalificaciones {

	private BOAsignatura boAsignatura;
	private BOCurso boCurso;
	private BORegistroCurso boRegistroCurso;
	
	public ControladorVerCalificaciones(){
		boAsignatura = new BOAsignatura();
		boCurso = new BOCurso();
		boRegistroCurso = new BORegistroCurso();
	}
	
	/**
	 * Metodo que busca una asignatura por su codigo
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param codigo, el codigo de la asignatura a buscar
	 * @return la asignatura buscada
	 * @throws Exception
	 */
	public Asignatura buscarAsignatura(String codigo) throws Exception{
		return boAsignatura.buscarAsignatura(codigo);
	}
	
	/**
	 * Metodo que lista los cursos por asignatura
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param asignatura, asignatura del curso
	 * @return
	 */
	public List<Curso> listarCursosPorAsignatura(Asignatura asignatura){
		return boCurso.listarCursosPorASignatura(asignatura);
	}
	
	/**
	 * Metodo que lista el registro curso por un determinado curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param curso, curso 
	 * @return, lista de los registros de un curso
	 */
	public List<RegistroCurso> listarRegistrosCursoPorCurso(Curso curso){
		return boRegistroCurso.listarRegistroCursoPorCurso(curso);
	}
}
