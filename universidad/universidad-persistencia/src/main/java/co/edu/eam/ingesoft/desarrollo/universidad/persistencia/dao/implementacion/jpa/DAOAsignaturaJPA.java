package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOAsignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

/**
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 16/08/2016<br/>
 */
public class DAOAsignaturaJPA implements IDAOAsignatura {

	public void crear(Asignatura asignatura) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		em.persist(asignatura);
		em.getTransaction().commit();

	}

	public void editar(Asignatura asignatura) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		em.merge(asignatura);
		em.getTransaction().commit();
	}

	public void eliminar(String codigo) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		Asignatura asig = buscar(codigo);
		if (asig != null) {
			em.remove(asig);
		}
		em.getTransaction().commit();

	}

	public Asignatura buscar(String codigo) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Asignatura.class, codigo);

	}

	public List<Asignatura> listarAsignatura() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
