package co.edu.eam.ingesoft.desarrollo.universidad.logica.bos;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAORegistroCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa.DAORegistroCursoJPA;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCursoPK;

public class BORegistroCurso {

	private IDAORegistroCurso daoRegistroCurso;
	
	public BORegistroCurso(){
		daoRegistroCurso = new DAORegistroCursoJPA();
	}
	
	/**
	 * Metodo para registrar un curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param curso, curso el cual se va a registrar
	 * @param estudiante, estudiante al cual se le registrara el curso
	 * @throws Exception
	 */
	public void registrarCurso(Curso curso, Estudiante estudiante) throws Exception{
		if(estudiante !=null){
			if(curso !=null){
				//Cursos del estudiante
				List<RegistroCurso> registroCurso = estudiante.getRegistroCurso();
				//Estudiantes del curso
				List<RegistroCurso> estudiantesCurso = daoRegistroCurso.listarEstudiantesPorCurso(estudiante);
				//El estudiante no puede registrar mas de 12 creditos
				if(consultarCreditosRegistradosPorEstudiante(estudiante).get(0)+curso.getAsignatura().getNumeroCreditos() <= 12){
					//No puede registrar si el curso alcanzo la capacidad maxima de 10 estudiantes
					if(estudiantesCurso.size() < 10){
						if(!buscarAsignatura(registroCurso, curso)){
							//Creo la llave primaria de registro curso
							RegistroCursoPK registroCursoPK = new RegistroCursoPK(estudiante.getCedula(), curso.getCodigo());
							//Inicializo un registro curso
							RegistroCurso registroCursos = new RegistroCurso();
							//Seteo los atributos del registro curso
							registroCursos.setRegistroCursoPK(registroCursoPK);
							registroCursos.setCurso(curso);
							registroCursos.setEstudiante(estudiante);
							//Creo el registro curso
							daoRegistroCurso.crear(registroCursos);
						}else{
							throw new ExcepcionNegocio("El estudiante ya registro la asignatura");
						}
					}else{
						throw new ExcepcionNegocio("No se puede registrar. El curso esta completo");
					}			
				}else{
					throw new ExcepcionNegocio("Limite de creditos superado");
				}
			}else{
				throw new ExcepcionNegocio("Seleccione un curso");
			}
		}else{
			throw new ExcepcionNegocio("Busque un estudiante");
		}
	}
	
	 
	/**
	 * Metodo para calcular el numero de creditos registrados por un estudiante
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 19/09/2016<br/>
	 * @param e, estudiante al que se le realizara la consulta
	 * @return, el numero de creditos registrados
	 */
	public List<Long> consultarCreditosRegistradosPorEstudiante(Estudiante e){
		 //Numero de creditos 
		List<Long> numeroCreditos = daoRegistroCurso.calcularCreditosRegistradosPorEstudiante(e);
		 //Verifico si no hay ningun credito registrado
		if(numeroCreditos.get(0)!=null){
			return numeroCreditos;
		}else{
			 //Agrego un 0 a la lista para que no quede null
			numeroCreditos.add(0, Long.parseLong(Integer.toString(0)));
			return numeroCreditos;
		}	
	}
	
	/**
	 * Metodo para verificar si ya se encuentra registrada determinada asignatura por estudiante
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param registroCurso, cursos registrados del estudiante
	 * @param curso, curso el cual va a registrar 
	 * @return true, si la asignatura ya se encuentra registrada, de lo contrario retorna false
	 */
	public boolean buscarAsignatura(List<RegistroCurso> registroCurso, Curso curso){
		for(RegistroCurso registro : registroCurso){
			//Asignantura del curso
			String codigoAsignatura = registro.getCurso().getAsignatura().getCodigo();
			//Verifico si ya esta registrada la asignatura
			if(codigoAsignatura.equals(curso.getAsignatura().getCodigo())){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Metodo para listar los cursos por estudiante
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param estudiante, estudiante por el cual se realizara la consulta
	 * @return una lista de los registros del estudiante
	 */
	public List<RegistroCurso> listarRegistroCursoPorEstudiante(Estudiante estudiante){
		return daoRegistroCurso.listarRegistroCursoPorEstudiante(estudiante);
	}
	
	/**
	 * Metodo para listar los estudiantes por curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 27/09/2016<br/>
	 * @param curso, curso por el cual se realizara la consulta
	 * @return, una lista de los registros de ese curso
	 */
	public List<RegistroCurso> listarRegistroCursoPorCurso(Curso curso){
		return daoRegistroCurso.listarRegistroCursoPorCurso(curso);
	}
	
	/**
	 * Metodo para eliminar un registro curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param codigo
	 */
	public void eliminarRegistroCurso(String codigo){
		daoRegistroCurso.eliminar(codigo);
	}
	
	/**
	 * Metodo para buscar un registro curso
	 * @author Jhoan Sebastian Salazar Henao<br/>
	 *         email: jsebastian48@hotmail.com <br/>
	 *         Fecha: 29/09/2016<br/>
	 * @param codigo
	 * @return
	 */
	public RegistroCurso buscarRegistroCurso(String codigo){
		return daoRegistroCurso.buscar(codigo);
	}
	
	
}
