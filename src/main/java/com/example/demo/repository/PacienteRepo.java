package com.example.demo.repository;

import com.example.demo.repository.modelo.Paciente;

public interface PacienteRepo {

	public void insertar(Paciente paciente);
	public void eliminar(String cedula);
	public Paciente buscar (String cedula);
	public void actualizar (Paciente paciente);
	
}
