package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase responsable de modelar un curso
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 7/09/2016<br/>
 */
@Entity
@Table(name="tb_curso")
@NamedQueries(value = {
		@NamedQuery(name = Curso.CONSULTA_LISTAR_POR_ASIGNATURA, query = "SELECT c FROM Curso c WHERE c.asignatura=?1"),
		@NamedQuery(name = Curso.CONSULTA_LISTAR_POR_DOCENTE, query = "SELECT cu FROM Curso cu WHERE cu.docente=?1")
})
public class Curso implements Serializable{
	
	public static final String CONSULTA_LISTAR_POR_ASIGNATURA = "Cursos.listarPorAsignatura";
	public static final String CONSULTA_LISTAR_POR_DOCENTE = "Cursos.listarPorDocente";
	
	/**
	 * Codigo del curso
	 */
	@Id
	@Column(name="codigo_curso", nullable=false, length=50)
	private String codigo;
	
	/**
	 * Asignatura de este curso
	 */
	@ManyToOne
	@JoinColumn(name="codigo_asignatura", nullable=false)
	private Asignatura asignatura;
	
	/**
	 * Docente que imparte la asignatura
	 */
	
	@ManyToOne
	@JoinColumn(name="cedula_docente", nullable=false)
	private Docente docente;

	/**
	 * Sesiones del curso
	 */
	@OneToMany(mappedBy="curso", cascade = CascadeType.ALL, fetch =FetchType.LAZY)
	private List<SesionCurso> sesiones;
	
	/**
	 * Constructor
	 */
	public Curso(){
		
	}

	/**
	 * Constructor
	 * @param codigo
	 * @param asignatura
	 * @param docente
	 */
	public Curso(String codigo, Asignatura asignatura, Docente docente) {
		super();
		this.codigo = codigo;
		this.asignatura = asignatura;
		this.docente = docente;
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
	 * @return El atributo asignatura
	 */
	public Asignatura getAsignatura() {
		return asignatura;
	}

	/**
	 * Establece el valor del atributo asignatura
	 * @param asignatura: EL asignatura a establecer
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	/**
	 * @return El atributo docente
	 */
	public Docente getDocente() {
		return docente;
	}

	/**
	 * Establece el valor del atributo docente
	 * @param docente: EL docente a establecer
	 */
	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	/**
	 * @return El atributo sesiones
	 */
	public List<SesionCurso> getSesiones() {
		return sesiones;
	}

	/**
	 * Establece el valor del atributo sesiones
	 * @param sesiones: EL sesiones a establecer
	 */
	public void setSesiones(List<SesionCurso> sesiones) {
		this.sesiones = sesiones;
	}

	@Override
	public String toString(){
		return codigo;
	}
	
}
