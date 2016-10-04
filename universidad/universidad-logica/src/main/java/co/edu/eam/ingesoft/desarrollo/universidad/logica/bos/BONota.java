package co.edu.eam.ingesoft.desarrollo.universidad.logica.bos;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAONota;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa.DAONotaJPA;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public class BONota {
	
	private IDAONota daoNota;
	
	public BONota(){
		daoNota = new DAONotaJPA();
	}

	/**
	 * Metodo que lista las notas de una evaluacion
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param evaluacion
	 * @param registroCurso
	 * @returnm una lista de evaluaciones
	 */
	public Nota listarNotasEvaluacion(Evaluacion evaluacion, RegistroCurso registroCurso){
		return daoNota.listarNotasEvaluacion(evaluacion, registroCurso);
	}
	
	/**
	 * Metodo para buscar una nota
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param id
	 * @return
	 */
	public Nota buscarNota(long id){
		return daoNota.buscar(id);
	}
	
	/**
	 * Metodo que crea una nota
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param nota
	 * @throws ExcepcionNegocio
	 */
	public void crearNota(Nota nota) throws ExcepcionNegocio{
		if(buscarNota(nota.getId()) == null){
			daoNota.crear(nota);
		}else{
			throw new ExcepcionNegocio("Error con la nota");
		}
	}
}
