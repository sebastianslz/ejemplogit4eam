package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOProfesion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOProfesionJPA implements IDAOProfesion{

	public List<Profesion> listarProfesion() throws Exception {
		// TODO Auto-generated method stub
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		String jpql = "SELECT prof FROM Profesion prof";
		Query q = em.createQuery(jpql);
		List<Profesion> profesion=q.getResultList();
		
		return profesion;
	}

}
