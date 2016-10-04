package co.edu.eam.ingesoft.desarrollo.universidad.logica.bos;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOEvaluacion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa.DAOEvaluacionJPA;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Evaluacion;

public class BOEvaluacion {

	private IDAOEvaluacion daoEvaluacion;
	
	public BOEvaluacion(){
		daoEvaluacion = new DAOEvaluacionJPA();
	}
	
	/**
	 * Metodo que crea una evaluacion
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param evaluacion
	 */
	public void crearEvaluacion(Evaluacion evaluacion) throws Exception{
		if(buscarEvaluacion(evaluacion.getId()) == null){
			daoEvaluacion.crear(evaluacion);
		}else{
			throw new ExcepcionNegocio("La evaluacion ya existe");
		}
	}
	
	/**
	 * Metodo para buscar una evaluacion
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param id, identificacion por la que se va a buscar una evaluacion
	 * @return, la evaluacion
	 */
	public Evaluacion buscarEvaluacion(long id){
		return daoEvaluacion.buscar(id);
	}
	
	/**
	 * Metodo para eliminar una evaluacion
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param id, identificacion por la que se va eliminar la evaluacion
	 */
	public void eliminarEvaluacion(long id){
		daoEvaluacion.eliminar(id);
	}
	
	/**
	 * Metodo para listar las evaluaciones por curso
	 * 
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param curso
	 * @return
	 */
	public List<Evaluacion> listarEvaluacionesPorCurso(Curso curso){
		return daoEvaluacion.listarEvaluacionesPorCurso(curso);
		
	}
}
