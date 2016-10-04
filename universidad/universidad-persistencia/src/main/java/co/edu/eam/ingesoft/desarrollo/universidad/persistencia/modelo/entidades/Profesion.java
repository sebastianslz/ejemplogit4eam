package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase responsable de modelar una profesion docente
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 8/08/2016<br/>
 */
@Table(name="tb_profesion")
@Entity
public class Profesion implements Serializable{

	/**
	 * Codigo de la profesion
	 */
	@Id
	@Column(name="codigo_prof", nullable=false, length=50)
	private String codigo;
	
	/**
	 * Nombre de la profesion
	 */
	@Column(name="nombre_prof", length=50)
	private String nombre;
	
	/**
	 * Constructor
	 */
	public Profesion(){
	}

	/**
	 * Constructor
	 * @param codigo
	 * @param nombre
	 */
	public Profesion(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}



	/**
	 * @return El atributo codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Establece el valor del atributo codigo
	 * @param codigo: EL codigo a establecer
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		if(arg0 instanceof Profesion){
			Profesion p = (Profesion) arg0;
			if(p.codigo.equals(codigo)){
				return true;
			}
		}
		return false;
	}
	
}
