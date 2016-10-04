package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Clase responsable de modelar una persona
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 8/08/2016<br/>
 */
@Entity
@Table(name="tb_persona")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona implements Serializable {
	
	/**
	 * Nombre de la persona
	 */
	@Column(name="nombre_per", length=50)
	private String nombre;
	
	/**
	 * Apellido de la persona
	 */
	@Column(name="apellido_per", length=50)
	private String apellido;
	
	/**
	 * Cedula de la persona
	 */
	@Id
	@Column(name="cedula_per", nullable=false, length=50)
	private String cedula;
	
	/**
	 * Correo de la persona
	 */
	@Column(name="correo_per", length=50)
	private String correo;
	
	/**
	 * Direccion de la persona
	 */
	@Column(name="direccion_per")
	private String direccion;
	
	/**
	 * Telefono de la persona
	 */
	@Column(name="telefono_per", length=50)
	private String telefono;
	
	/**
	 * Constructor
	 */
	public Persona(){
	}

	/**
	 * Constructor
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param correo
	 * @param direccion
	 * @param telefono
	 */
	public Persona(String nombre, String apellido, String cedula, String correo, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.correo = correo;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	/**
	 * @return El atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el valor del atributo nombre
	 * @param nombre: EL nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return El atributo apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Establece el valor del atributo apellido
	 * @param apellido: EL apellido a establecer
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return El atributo cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * Establece el valor del atributo cedula
	 * @param cedula: EL cedula a establecer
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return El atributo correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Establece el valor del atributo correo
	 * @param correo: EL correo a establecer
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return El atributo direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Establece el valor del atributo direccion
	 * @param direccion: EL direccion a establecer
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return El atributo telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Establece el valor del atributo telefono
	 * @param telefono: EL telefono a establecer
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
