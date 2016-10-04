package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.enumeraciones.DiaEnum;

/**
 * Clase responsable de modelar la sesion de un curso
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 8/09/2016<br/>
 */
@Entity
@Table(name="tb_sesioncurso")
@NamedQueries(value={
		@NamedQuery(name=SesionCurso.SESION_CURSO_LISTAR_POR_CURSO, query = "SELECT sc FROM SesionCurso sc WHERE sc.curso=?1")
})
public class SesionCurso implements Serializable{
	
	public static final String SESION_CURSO_LISTAR_POR_CURSO = "SesionCurso.listarPorCurso";

	/**
	 * Llave autonumerica de la entidad
	 */
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCurso;
	
	/**
	 * Dia de la sesion
	 */
	@Column(name="dia_sesion", nullable=false)
	@Enumerated(EnumType.STRING)
	private DiaEnum dia;
	
	/**
	 * Hora en que termina la sesion
	 */
	@Column(name="horafinal_sesion", nullable=false)
	private int horaFinal;
	
	/**
	 * Hora en que empieza una sesion
	 */
	@Column(name="horainicio_sesion", nullable=false)
	private int horaInicio;
	
	/**
	 * Curso de la sesion
	 */
	@ManyToOne
	@JoinColumn(name="codigo_curso", nullable=false)
	private Curso curso;
	
	/**
	 * Constructor
	 */
	public SesionCurso(){
		super();
	}

	/**
	 * Constructor
	 * @param dia
	 * @param horaFinal
	 * @param horaInicio
	 * @param curso
	 */
	public SesionCurso(DiaEnum dia, int horaFinal, int horaInicio, Curso curso) {
		super();
		this.dia = dia;
		this.horaFinal = horaFinal;
		this.horaInicio = horaInicio;
		this.curso = curso;
	}

	/**
	 * @return El atributo idCurso
	 */
	public long getIdCurso() {
		return idCurso;
	}

	/**
	 * Establece el valor del atributo idCurso
	 * @param idCurso: EL idCurso a establecer
	 */
	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}

	/**
	 * @return El atributo dia
	 */
	public DiaEnum getDia() {
		return dia;
	}

	/**
	 * Establece el valor del atributo dia
	 * @param dia: EL dia a establecer
	 */
	public void setDia(DiaEnum dia) {
		this.dia = dia;
	}

	/**
	 * @return El atributo horaFinal
	 */
	public int getHoraFinal() {
		return horaFinal;
	}

	/**
	 * Establece el valor del atributo horaFinal
	 * @param horaFinal: EL horaFinal a establecer
	 */
	public void setHoraFinal(int horaFinal) {
		this.horaFinal = horaFinal;
	}

	/**
	 * @return El atributo horaInicio
	 */
	public int getHoraInicio() {
		return horaInicio;
	}

	/**
	 * Establece el valor del atributo horaInicio
	 * @param horaInicio: EL horaInicio a establecer
	 */
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
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
