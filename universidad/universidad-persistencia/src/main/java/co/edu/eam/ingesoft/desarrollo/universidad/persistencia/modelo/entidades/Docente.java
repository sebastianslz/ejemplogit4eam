package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase responsable de modelar un docente
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 8/08/2016<br/>
 */
@Table(name="tb_docente")
@Entity
public class Docente extends Persona implements Serializable {
	
	/**
	 * Profesion del docente
	 */
	@ManyToOne
	@JoinColumn(name="profesion_doc", nullable=false)
	private Profesion profesion;
	
	/**
	 * Indica si el docente tiene postgrado
	 */
	@Column(name="postgrado_doc")
	private boolean postgrado;
	
	/**
	 * Constructor
	 */
	public Docente(){
	}
	
	
	/**
	 * Constructor
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param correo
	 * @param direccion
	 * @param telefono
	 * @param profesion
	 * @param postgrado
	 */
	public Docente(String nombre, String apellido, String cedula, String correo, String direccion, String telefono,
			Profesion profesion, boolean postgrado) {
		super(nombre, apellido, cedula, correo, direccion, telefono);
		this.profesion = profesion;
		this.postgrado = postgrado;
	}



	/**
	 * @return El atributo profesion
	 */
	public Profesion getProfesion() {
		return profesion;
	}

	/**
	 * Establece el valor del atributo profesion
	 * @param profesion: EL profesion a establecer
	 */
	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	/**
	 * @return El atributo postgrado
	 */
	public boolean isPostgrado() {
		return postgrado;
	}

	/**
	 * Establece el valor del atributo postgrado
	 * @param postgrado: EL postgrado a establecer
	 */
	public void setPostgrado(boolean postgrado) {
		this.postgrado = postgrado;
	}

	
	


	

}
