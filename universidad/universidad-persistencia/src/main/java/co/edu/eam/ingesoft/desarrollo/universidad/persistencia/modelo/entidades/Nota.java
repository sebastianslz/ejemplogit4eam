package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Clase responsable de modelar una nota de una evaluacion de un curso
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 8/09/2016<br/>
 */
@Entity
@Table(name="tb_nota")
@NamedQueries(value = {
		@NamedQuery(name = Nota.CONSULTAR_NOTAS, query = "SELECT n FROM Nota n WHERE n.evaluacion=?1 AND n.registroCurso=?2"),
})
public class Nota implements Serializable{

	public static final String CONSULTAR_NOTAS = "Nota.listaNota";
	/**
	 * Llava autonumerica de la entidad
	 */
	@Id
	@Column(name="ID", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	/**
	 * Indica si la nota fue modificada
	 */
	@Column(name="editada_nota", nullable=false)
	private boolean editada;
	
	/**
	 * Nota que se puso
	 */
	@Column(name="valor_nota", nullable=false)
	private double valor;
	
	/**
	 * Evaluacion a la que pertenece esta nota
	 */
	@ManyToOne
	@JoinColumn(name="id_evaluacion", nullable=false)
	private Evaluacion evaluacion;
	
	/**
	 * Curso y estudiante al que pertenece esta nota
	 */
	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codigo_cur", nullable=false),
		@JoinColumn(name="cedula_est", nullable=false)
	})
	private RegistroCurso registroCurso;
	
	/**
	 * Constructor
	 */
	public Nota(){
		super();
		editada=false;
	}
	
	/**
	 * 
	 * @param evaluacion
	 * @param valor
	 */
	public Nota(Evaluacion evaluacion, double valor) {
		super();
		this.evaluacion = evaluacion;
		this.valor = valor;
		this.editada = false;
	}

	/**
	 * Constructor
	 * @param id
	 * @param editada
	 * @param valor
	 * @param evaluacion
	 * @param registroCurso
	 */
	public Nota(boolean editada, double valor, Evaluacion evaluacion, RegistroCurso registroCurso) {
		super();
		this.editada = editada;
		this.valor = valor;
		this.evaluacion = evaluacion;
		this.registroCurso = registroCurso;
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
	 * @return El atributo editada
	 */
	public boolean isEditada() {
		return editada;
	}

	/**
	 * Establece el valor del atributo editada
	 * @param editada: EL editada a establecer
	 */
	public void setEditada(boolean editada) {
		this.editada = editada;
	}

	/**
	 * @return El atributo valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * Establece el valor del atributo valor
	 * @param valor: EL valor a establecer
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @return El atributo evaluacion
	 */
	public Evaluacion getEvaluacion() {
		return evaluacion;
	}

	/**
	 * Establece el valor del atributo evaluacion
	 * @param evaluacion: EL evaluacion a establecer
	 */
	public void setEvaluacion(Evaluacion evaluacion) {
		this.evaluacion = evaluacion;
	}

	/**
	 * @return El atributo registroCurso
	 */
	public RegistroCurso getRegistroCurso() {
		return registroCurso;
	}

	/**
	 * Establece el valor del atributo registroCurso
	 * @param registroCurso: EL registroCurso a establecer
	 */
	public void setRegistroCurso(RegistroCurso registroCurso) {
		this.registroCurso = registroCurso;
	}

	
	
}
