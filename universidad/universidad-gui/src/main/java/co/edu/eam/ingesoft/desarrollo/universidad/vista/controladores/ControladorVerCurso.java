package co.edu.eam.ingesoft.desarrollo.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BORegistroCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public class ControladorVerCurso {

	private BOAsignatura boAsignatura;
	private BOCurso boCurso;
	private BORegistroCurso boRegistroCurso;
	
	public ControladorVerCurso(){
		boAsignatura = new BOAsignatura();
		boCurso = new BOCurso();
		boRegistroCurso = new BORegistroCurso();
	}
	
	/**
	 * Metodo que busca una asignatura por su codigo
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param codigo, el codigo de la asignatura a buscar
	 * @return, la asignatura
	 * @throws Exception
	 */
	public Asignatura buscarAsignatura(String codigo) throws Exception{
		return boAsignatura.buscarAsignatura(codigo);
	}
	
	/**
	 * Metodo para listar los cursos de una asignatura 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param asignatura, asignatura con la que se realizara la consulta
	 * @return, una lista con los cursos de la asignatura
	 */
	public List<Curso> listarCursosPorAsignatura(Asignatura asignatura){
		return boCurso.listarCursosPorASignatura(asignatura);
	}
	
	/**
	 * Metodo para listar un todos los registros curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param curso, curso a buscar
	 * @return
	 */
	public List<RegistroCurso> listarRegistrosCursoPorCurso(Curso curso){
		return boRegistroCurso.listarRegistroCursoPorCurso(curso);
	}
}
