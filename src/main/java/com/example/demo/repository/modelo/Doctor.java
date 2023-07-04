package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "doctor")
@Entity
public class Doctor {
	
	@Id
	@SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor", allocationSize = 1)
	@GeneratedValue(generator = "seq_doctor", strategy = GenerationType.SEQUENCE)
	@Column(name = "doct_id")
	private Integer id;
	
	@Column(name = "doct_cedula")
	private String cedula;
	
	@Column(name = "doct_nombre")
	private String nombre;
	
	@Column(name = "doct_apellido")
	private String apellido;
	
	@Column(name = "doct_fecha_nacimiento")
	private LocalDateTime fechaNacimento;
	
	@Column(name = "doct_numero_cosultorio")
	private String numConsultorio;
	
	@Column(name = "doct_codigo_senesyt")
	private String codSenesyt;
	
	@Column(name = "doct_genero")
	private String genero;

	
	//GET Y SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimento() {
		return fechaNacimento;
	}

	public void setFechaNacimento(LocalDateTime fechaNacimento) {
		this.fechaNacimento = fechaNacimento;
	}

	public String getNumConsultorio() {
		return numConsultorio;
	}

	public void setNumConsultorio(String numConsultorio) {
		this.numConsultorio = numConsultorio;
	}

	public String getCodSenesyt() {
		return codSenesyt;
	}

	public void setCodSenesyt(String codSenesyt) {
		this.codSenesyt = codSenesyt;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimento=" + fechaNacimento + ", numConsultorio=" + numConsultorio + ", codSenesyt="
				+ codSenesyt + ", genero=" + genero + "]";
	}
	
	
	
	
}
