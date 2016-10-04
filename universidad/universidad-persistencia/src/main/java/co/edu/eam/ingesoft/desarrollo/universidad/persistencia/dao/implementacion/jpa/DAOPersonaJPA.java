package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOPersona;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Persona;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

/**
 * Clase responsable del DAO de persona implementancion JPA
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 14/08/2016<br/>
 */
public class DAOPersonaJPA implements IDAOPersona {

	public void crear(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		
		
	}

	public void editar(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	public Persona buscar(String cedula) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Persona.class, cedula);
		
	}

	public List<Persona> listarPersonas() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
