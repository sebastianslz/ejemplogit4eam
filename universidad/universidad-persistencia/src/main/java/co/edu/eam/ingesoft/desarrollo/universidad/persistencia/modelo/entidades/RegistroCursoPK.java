package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;
/**
 * Llave primaria de la entidad
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 8/09/2016<br/>
 */
public class RegistroCursoPK implements Serializable{
	
	/**
	 * Estudiante que registro el curso
	 */
	private String estudiante;	
	
	/**
	 * Curso que registro el estudiante
	 */
	private String curso;
	
	/**
	 * Constructor
	 */
	public RegistroCursoPK(){
		
	}

	/**
	 * Constructor
	 * @param estudiante
	 * @param curso
	 */
	public RegistroCursoPK(String estudiante, String curso) {
		super();
		this.estudiante = estudiante;
		this.curso = curso;
	}

	/**
	 * @return El atributo estudiante
	 */
	public String getEstudiante() {
		return estudiante;
	}

	/**
	 * Establece el valor del atributo estudiante
	 * @param estudiante: EL estudiante a establecer
	 */
	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}

	/**
	 * @return El atributo curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Establece el valor del atributo curso
	 * @param curso: EL curso a establecer
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
