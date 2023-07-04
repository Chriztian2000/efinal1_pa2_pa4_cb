package com.example.demo.service;

import com.example.demo.repository.modelo.Paciente;

public interface PacienteService {
	
	public void insertar(Paciente paciente);
	public void quitar(String cedula);
	public Paciente buscar (String cedula);
	public void modificar (Paciente paciente);

}
