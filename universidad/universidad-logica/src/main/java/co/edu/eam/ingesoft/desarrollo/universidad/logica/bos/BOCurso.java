package co.edu.eam.ingesoft.desarrollo.universidad.logica.bos;

import java.util.List;


import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa.DAOCursoJPA;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;

public class BOCurso {
	
	private IDAOCurso daoCurso;
	
	public BOCurso(){
		daoCurso = new DAOCursoJPA();
	}
	
	/**
	 * Metodo para buscar un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param codigo, codigo del curso a buscar
	 * @return, el curso encontrado
	 */
	public Curso buscarCurso(String codigo){
		return daoCurso.buscar(codigo);
	}
	
	/**
	 * Metodo para crear un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param curso, curso que se va a crear
	 */
	public void crearCurso(Curso curso){
		daoCurso.crear(curso);
	}
	
	/**
	 * Metodo para editar un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param curso, curso que se va a realizar
	 */
	public void editarCurso(Curso curso){
		daoCurso.editar(curso);
	}
	
	/**
	 * Metodo para listar los cursos por asignatura
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param asignatura, asignatura por la que se va a realizar la consulta
	 * @return, una lista con los cursos de la asignatura
	 */
	public List<Curso> listarCursosPorASignatura(Asignatura asignatura){
		return daoCurso.listarCursosPorAsignatura(asignatura); 
	}
	
	/**
	 * Metodo para listar los cursos por docente
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param docente, docente por el que se va a realizar la consulta
	 * @return, una lista con los cursos del docente
	 */
	public List<Curso> listarCursosPorDocente(Docente docente){
		return daoCurso.listarCursoPorDocente(docente);
	}
	

}
