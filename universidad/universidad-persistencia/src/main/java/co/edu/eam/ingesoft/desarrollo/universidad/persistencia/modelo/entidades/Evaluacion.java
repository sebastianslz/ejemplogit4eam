package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Clase responsable de modelar la evaluacion de un curso
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 7/09/2016<br/>
 */
@Entity
@Table(name="tb_evaluacion")
@NamedQueries(value ={
		@NamedQuery(name = Evaluacion.CONSULTAR_LISTA_CALIFICACIONES_POR_CURSO, query = "SELECT e FROM Evaluacion e WHERE e.curso=?1")
		
})
public class Evaluacion implements Serializable{
	
	public static final String CONSULTAR_LISTA_CALIFICACIONES_POR_CURSO = "evaluacion.listarPorCurso";

	/**
	 * Llave primaria de la entidad
	 */
	@Id
	@Column(name="ID", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	/**
	 * Nombre de la evaluacion
	 */
	@Column(name="nombre_eval", nullable=false)
	private String nombre;
	
	/**
	 * Porcentaje que vale esta evaluacion dentro del curso
	 */
	@Column(name="porcentaje_eval", nullable=false)
	private double porcentaje;
	
	/**
	 * Curso al que pertenece esta evaluacion
	 */
	@ManyToOne
	@JoinColumn(name="codigo_cur",  nullable=false)
	private Curso curso;
	
	/**
	 * Constructor
	 */
	public Evaluacion(){
		
	}

	/**
	 * Constructor
	 * @param id
	 * @param nombre
	 * @param porcentaje
	 * @param curso
	 */
	public Evaluacion(String nombre, double porcentaje, Curso curso) {
		super();
		this.nombre = nombre;
		this.porcentaje = porcentaje;
		this.curso = curso;
	}

	/**
	 * @return El atributo id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Establece el valor del atributo id
	 * @param id: EL id a establecer
	 */
	public void setId(long id) {
		this.id = id;
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
	 * @return El atributo porcentaje
	 */
	public double getPorcentaje() {
		return porcentaje;
	}

	/**
	 * Establece el valor del atributo porcentaje
	 * @param porcentaje: EL porcentaje a establecer
	 */
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	/**
	 * @return El atributo curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * Establece el valor del atributo curso
	 * @param curso: EL curso a establecer
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
}
