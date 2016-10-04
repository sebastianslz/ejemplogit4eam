package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAODocente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

/**
 * Clase responsable del DAO de docente implementacion JPA
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 14/08/2016<br/>
 */
public class DAODocenteJPA implements IDAODocente{

	public void crear(Docente docente) throws Exception {
		// TODO Auto-generated method stub
EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(docente);
		em.getTransaction().commit();
		
	}

	public void editar(Docente docente) throws Exception {
		// TODO Auto-generated method stub
EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		em.merge(docente);
		em.getTransaction().commit();
	}

	public void eliminar(String cedula) throws Exception {
		// TODO Auto-generated method stub
EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		Docente d = buscar(cedula);
		if(d!=null){
			em.remove(d);
		}
		em.getTransaction().commit();
	}

	public Docente buscar(String cedula) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Docente.class, cedula);
	}

	public List<Docente> listarDocentes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
