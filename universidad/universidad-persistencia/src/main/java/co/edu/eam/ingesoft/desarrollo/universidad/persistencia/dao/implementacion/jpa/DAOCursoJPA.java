package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

/**
 * Clase responsable del DAO de curso implementacion JPA
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 15/09/2016<br/>
 */
public class DAOCursoJPA implements IDAOCurso{
	
	/**
	 * Metodo para crear un curso con JPA
	 */
	public void crear(Curso curso) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(curso);
		em.getTransaction().commit();
	}

	/**
	 * Metodo para editar un curso con JPA
	 */
	public void editar(Curso curso) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		em.merge(curso);
		em.getTransaction().commit();
	}

	/**
	 * Metodo para eliminar un curso con JPA
	 */
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		Curso c = buscar(codigo);
		if(c!=null){
			em.remove(c);
		}
		em.getTransaction().commit();
	}

	/**
	 *Metodo para buscar un curso con JPA 
	 */
	public Curso buscar(String codigo) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Curso.class, codigo);
	}

	/**
	 * 
	 */
	public List<Curso> listarCursos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Metodo para listar los cursos por asignatura
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 20/09/2016<br/>
	 * @param asignatura, asignatura con la que se realizara la consulta
	 * @return, una lista de los cursos de la asignatura
	 */
	public List<Curso> listarCursosPorAsignatura(Asignatura asignatura){
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		Query q = em.createNamedQuery(Curso.CONSULTA_LISTAR_POR_ASIGNATURA);
		q.setParameter(1, asignatura);
		
		return q.getResultList();
	}
	
	/**
	 * Metodo para los cursos por docente
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 28/09/2016<br/>
	 * @param docente, docente con el que se realizara la consulta
	 * @return, una lista de los cursos del docente
	 */
	public List<Curso> listarCursoPorDocente(Docente docente){
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		Query q = em.createNamedQuery(Curso.CONSULTA_LISTAR_POR_DOCENTE);
		q.setParameter(1, docente);
		
		return q.getResultList();
	}

	

}
