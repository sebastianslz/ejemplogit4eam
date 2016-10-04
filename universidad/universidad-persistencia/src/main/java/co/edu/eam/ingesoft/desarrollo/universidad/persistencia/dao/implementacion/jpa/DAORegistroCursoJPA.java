package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAORegistroCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAORegistroCursoJPA implements IDAORegistroCurso{
   		
	/**
	 * Metodo para listar los estudiantes por curso
	 */
	public List<RegistroCurso> listarRegistroCursoPorCurso(Curso curso) {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
	
		Query q = em.createNamedQuery(RegistroCurso.LISTAR_REGISTRO_CURSO_POR_CURSO);	
		q.setParameter(1, curso);
		
		return q.getResultList();
		
	}

	/**
	 * Metodo para listar los cursos por estudiante
	 */
	public List<RegistroCurso> listarEstudiantesPorCurso(Estudiante estudiante) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		Query q = em.createNamedQuery(RegistroCurso.CONSULTAR_REGISTRO_CURSO_POR_ESTUDIANTE);
		q.setParameter(1, estudiante);
		
		return q.getResultList();
	}

	/**
	 * Metodo para calcular el numero de creditos registrados por estudiante
	 */
	public List<Long> calcularCreditosRegistradosPorEstudiante(Estudiante estudiante) {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		Query q = em.createNamedQuery(RegistroCurso.CONSULTAR_CREDITOS_REGISTRADOS_ESTUDIANTE);
		q.setParameter(1, estudiante);
		 
		return q.getResultList();
	}

	/**
	 * 
	 */
	public List<RegistroCurso> listarRegistroCursoPorEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		Query q = em.createNamedQuery(RegistroCurso.CONSULTAR_REGISTRO_CURSO_POR_ESTUDIANTE);
		q.setParameter(1, estudiante);
		
		return q.getResultList();
		
	}

	public void crear(RegistroCurso registroCurso) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(registroCurso);
		em.getTransaction().commit();
		
	}
	
	public RegistroCurso buscar(String codigo){
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(RegistroCurso.class, codigo);
	}

	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		RegistroCurso registroCurso = buscar(codigo);
		if(registroCurso!=null){
			em.remove(registroCurso);
		}
		em.getTransaction().commit();
	}

}
