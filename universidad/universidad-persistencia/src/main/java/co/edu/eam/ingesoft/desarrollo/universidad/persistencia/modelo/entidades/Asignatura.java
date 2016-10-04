package co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.enumeraciones.TipoAsignaturaEnum;

/**
 * Clase responsable de modelar una asignatura
 * 
 * @author Jhoan Sebastian Salazar Henao<br/>
 *         email: jsebastian48@hotmail.com <br/>
 *         Fecha: 16/08/2016<br/>
 */

@Entity
@Table(name = "tb_asignatura")
public class Asignatura implements Serializable {

		/**
		 * Nombre de la asignatura-
		 */
		@Column(name = "nombre_asig",nullable = false, length=50)
		private String nombre;
		/**
		 * Codigo de la asignatura
		 */
		@Id
		@Column(name = "codigo_asig", length=50)
		private String codigo;

		/**
		 * Tipo de asignatura
		 */
		@Column(name = "tipo_asig", nullable = false, length=50)
		@Enumerated(EnumType.STRING)
		private TipoAsignaturaEnum tipo;

		/**
		 * Numero de creditos asignatura.
		 */
		@Column(name = "numerocreditos_asig", nullable = false)
		private int numeroCreditos;

		/**
		 * Semstre asignatura.
		 */
		@Column(name = "semestre_asig", nullable = false)
		private int semestre;

		/**
		 *Constructor
		 */
		public Asignatura() {
		}

		/**
		 * Constructor
		 * @param nombre
		 * @param codigo
		 * @param tipo
		 * @param numeroCreditos
		 * @param semestre
		 */
		public Asignatura(String nombre, String codigo, TipoAsignaturaEnum tipo, int numeroCreditos, int semestre) {
			this.nombre = nombre;
			this.codigo = codigo;
			this.tipo = tipo;
			this.numeroCreditos = numeroCreditos;
			this.semestre = semestre;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre
		 *            the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the codigo
		 */
		public String getCodigo() {
			return codigo;
		}

		/**
		 * @param codigo
		 *            the codigo to set
		 */
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		/**
		 * @return the tipo
		 */
		public TipoAsignaturaEnum getTipo() {
			return tipo;
		}

		/**
		 * @param tipo
		 *            the tipo to set
		 */
		public void setTipo(TipoAsignaturaEnum tipo) {
			this.tipo = tipo;
		}

		/**
		 * @return the numeroCreditos
		 */
		public int getNumeroCreditos() {
			return numeroCreditos;
		}

		/**
		 * @param numeroCreditos
		 *            the numeroCreditos to set
		 */
		public void setNumeroCreditos(int numeroCreditos) {
			this.numeroCreditos = numeroCreditos;
		}

		public int getSemestre() {
			return semestre;
		}

		public void setSemestre(int semestre) {
			this.semestre = semestre;
		}

	}

