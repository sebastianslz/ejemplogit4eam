package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOSesionCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.SesionCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

/**
 * Clase responsable del DAO de sesion curso implementacion JPA
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 16/09/2016<br/>
 */
public class DAOSesionCursoJPA implements IDAOSesionCurso{

	public void crear(SesionCurso sesionCurso) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(sesionCurso);
		em.getTransaction().commit();
		
	}

	public void editar(SesionCurso sesionCurso) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		em.merge(sesionCurso);
		em.getTransaction().commit();
	}

	public void eliminar(long id) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		SesionCurso sc = buscar(id);
		if(sc!=null){
			em.remove(sc);
		}
		em.getTransaction().commit();
	}

	public SesionCurso buscar(long id) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(SesionCurso.class, id);
		
	}

	/**
	 * Metodo para listar las sesiones de un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param curso, curso al cual se le hara la consulta
	 * @return, las sesiones del curso
	 */
	public List<SesionCurso> listarSesionCursoPorCurso(Curso curso) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		Query q = em.createNamedQuery(SesionCurso.SESION_CURSO_LISTAR_POR_CURSO);
		q.setParameter(1, curso);
		
		return q.getResultList();
		
	}

	public List<SesionCurso> listarSesionCurso() {
		// TODO Auto-generated method stub
		return null;
	}

}
