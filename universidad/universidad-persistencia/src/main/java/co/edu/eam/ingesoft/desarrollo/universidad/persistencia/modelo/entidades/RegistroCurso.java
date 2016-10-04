package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * Clase responsable de modelar un curso registrado por un estudiante
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 8/09/2016<br/>
 */
@Entity
@IdClass(RegistroCursoPK.class)
@Table(name="tb_registrocurso")
@NamedQueries(value = {
		@NamedQuery(name=RegistroCurso.CONSULTAR_REGISTRO_CURSO_POR_ESTUDIANTE, query = "SELECT rc FROM RegistroCurso rc WHERE rc.estudiante=?1"),
		@NamedQuery(name=RegistroCurso.LISTAR_REGISTRO_CURSO_POR_CURSO, query = "SELECT rc FROM RegistroCurso rc WHERE rc.curso=?1"),
		@NamedQuery(name=RegistroCurso.CONSULTAR_CREDITOS_REGISTRADOS_ESTUDIANTE, query = "SELECT SUM(rc.curso.asignatura.numeroCreditos) FROM RegistroCurso rc WHERE rc.estudiante=?1"),
})
public class RegistroCurso implements Serializable{
	
	 public static final String CONSULTAR_REGISTRO_CURSO_POR_ESTUDIANTE = "RegistroCurso.listarRegistroCursoPorEstudiante";
	 public static final String CONSULTAR_CREDITOS_REGISTRADOS_ESTUDIANTE = "RegistroCurso.conulstarCreditosDeEstudiante";
	 public static final String LISTAR_REGISTRO_CURSO_POR_CURSO = "RegistroCurso.listarRegistroCursoPorCurso";
	
	 private RegistroCursoPK registroCursoPK;

	/**
	 * Estudiante que registro el curso
	 */
	@Id
	@ManyToOne
	@JoinColumn(name="cedula_est", nullable=false)
	private Estudiante estudiante;
	
	/**
	 * Curso que registro el estudiante
	 */
	@Id
	@ManyToOne
	@JoinColumn(name="codigo_cur", nullable=false)
	private Curso curso;
	
	/**
	 * Notas que el estudiante tiene registradas en este curso
	 */
	@OneToMany(mappedBy="registroCurso", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Nota> notas;
	
	/**
	 * Constructor
	 */
	public RegistroCurso(){
		
	}

	/**
	 * @param registroCursoPK
	 * @param estudiante
	 * @param curso
	 * @param notas
	 */
	public RegistroCurso(RegistroCursoPK registroCursoPK, Estudiante estudiante, Curso curso, List<Nota> notas) {
		super();
		this.registroCursoPK = registroCursoPK;
		this.estudiante = estudiante;
		this.curso = curso;
		this.notas = notas;
	}

	/**
	 * @return El atributo registroCursoPK
	 */
	public RegistroCursoPK getRegistroCursoPK() {
		return registroCursoPK;
	}

	/**
	 * Establece el valor del atributo registroCursoPK
	 * @param registroCursoPK: EL registroCursoPK a establecer
	 */
	public void setRegistroCursoPK(RegistroCursoPK registroCursoPK) {
		this.registroCursoPK = registroCursoPK;
	}

	/**
	 * @return El atributo estudiante
	 */
	public Estudiante getEstudiante() {
		return estudiante;
	}

	/**
	 * Establece el valor del atributo estudiante
	 * @param estudiante: EL estudiante a establecer
	 */
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
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

	/**
	 * @return El atributo notas
	 */
	public List<Nota> getNotas() {
		return notas;
	}

	/**
	 * Establece el valor del atributo notas
	 * @param notas: EL notas a establecer
	 */
	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	
	
	

}
