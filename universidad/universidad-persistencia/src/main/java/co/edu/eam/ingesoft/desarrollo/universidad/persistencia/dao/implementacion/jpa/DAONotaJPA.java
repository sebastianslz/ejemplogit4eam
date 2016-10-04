package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAONota;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAONotaJPA implements IDAONota{

	/**
	 * Metodo para listar las notas de una evaluacion
	 */
	public Nota listarNotasEvaluacion(Evaluacion evaluacion, RegistroCurso registroCurso) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		Query q = em.createNamedQuery(Nota.CONSULTAR_NOTAS);
		q.setParameter(1, evaluacion);
		q.setParameter(2, registroCurso);
		List<Nota> lista=q.getResultList();
		for(int i=0; i<lista.size(); i++){
			Nota nota = lista.get(i);
			return nota;
		}
		
		return null;
		
	}

	public void crear(Nota nota) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(nota);
		em.getTransaction().commit();
	}

	public Nota buscar(long id) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Nota.class,id);
		
	}

}
