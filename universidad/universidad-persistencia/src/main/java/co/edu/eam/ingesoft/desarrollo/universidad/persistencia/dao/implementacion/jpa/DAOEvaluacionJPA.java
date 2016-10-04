package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOEvaluacion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

/**
 * Clase responsable de la evaluacion implementacion JPA
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 27/09/2016<br/>
 */
public class DAOEvaluacionJPA implements IDAOEvaluacion{

	/**
	 * Metodo para crear una evaluacion
	 */
	public void crear(Evaluacion evaluacion){
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(evaluacion);
		em.getTransaction().commit();
	}
	
	
	/**
	 *Metodo para listar las calificaciones por curso
	 */
	public List<Evaluacion> listarEvaluacionesPorCurso(Curso curso) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		Query q = em.createNamedQuery(Evaluacion.CONSULTAR_LISTA_CALIFICACIONES_POR_CURSO);
		q.setParameter(1, curso);
		 
		return q.getResultList();
		
	}

	/**
	 * Metodo para buscar una evaluacion
	 */
	public Evaluacion buscar(long id) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Evaluacion.class, id);
		
	}

	/**
	 * Metodo para eliminar una evaluacion
	 */
	public void eliminar(long id) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		Evaluacion eval = buscar(id);
		if(eval!=null){
			em.remove(eval);
		}
		em.getTransaction().commit();
	}

}
