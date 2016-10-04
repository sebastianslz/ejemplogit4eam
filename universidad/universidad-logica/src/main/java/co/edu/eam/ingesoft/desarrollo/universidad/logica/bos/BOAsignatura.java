package co.edu.eam.ingesoft.desarrollo.universidad.logica.bos;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOAsignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa.DAOAsignaturaJPA;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;

public class BOAsignatura {

	private IDAOAsignatura daoAsignatura;
	
	public BOAsignatura(){
		daoAsignatura=new DAOAsignaturaJPA();
	}
	
	public Asignatura buscarAsignatura(String codigo) throws Exception{
		return daoAsignatura.buscar(codigo);
	}
	
	public void crearAsignatura(Asignatura asignatura) throws Exception{
		if(buscarAsignatura(asignatura.getCodigo())==null){
			daoAsignatura.crear(asignatura);
		}else{
			throw new ExcepcionNegocio("La asignatura ya existe");
		}
	}
	
	public void editarAsignatura(Asignatura asignatura) throws Exception{
		daoAsignatura.editar(asignatura);
	}
	
	public void eliminarAsignatura(String codigo) throws Exception{
		daoAsignatura.eliminar(codigo);
	}
	
	
	
	
}
