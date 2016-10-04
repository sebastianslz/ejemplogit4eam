package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Clase responsable de entregar el EntityManager 
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 14/08/2016<br/>
 */
public class AdministradorEntityManager {

	private static EntityManager em;
	
	public static EntityManager getEntityManager(){
		
		if (em == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_pu");

			em = emf.createEntityManager();
		}
		return em;
		
	}
	
}
