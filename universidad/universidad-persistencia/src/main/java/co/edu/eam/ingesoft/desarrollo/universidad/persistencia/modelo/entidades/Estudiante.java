package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase responsable de modelar un estudiante
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 8/08/2016<br/>
 */
@Entity
@Table(name="tb_estudiante")
public class Estudiante extends Persona implements Serializable{

	/**
	 * Fecha nacimiento estudiante
	 */
	@Column(name="fechanacimiento_est")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	/**
	 * Cursos registrados por el estudiante
	 */
	@OneToMany(mappedBy="estudiante", cascade=CascadeType.ALL)
	private List<RegistroCurso> registroCurso;
	
	/**
	 * Constructor
	 */
	public Estudiante(){
	}
	
	
	/**
	 * Constructor
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param correo
	 * @param direccion
	 * @param telefono
	 * @param fechaNacimiento
	 */
	public Estudiante(String nombre, String apellido, String cedula, String correo, String direccion, String telefono,
			Date fechaNacimiento) {
		super(nombre, apellido, cedula, correo, direccion, telefono);
		this.fechaNacimiento = fechaNacimiento;
	}



	/**
	 * @return El atributo fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Establece el valor del atributo fechaNacimiento
	 * @param fechaNacimiento: EL fechaNacimiento a establecer
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	/**
	 * @return El atributo registroCurso
	 */
	public List<RegistroCurso> getRegistroCurso() {
		return registroCurso;
	}


	/**
	 * Establece el valor del atributo registroCurso
	 * @param registroCurso: EL registroCurso a establecer
	 */
	public void setRegistroCurso(List<RegistroCurso> registroCurso) {
		this.registroCurso = registroCurso;
	}
	
	
	
	
	
}
