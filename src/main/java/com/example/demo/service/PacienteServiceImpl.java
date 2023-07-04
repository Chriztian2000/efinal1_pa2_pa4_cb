package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PacienteRepo;
import com.example.demo.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepo pacienteRepo;

	@Override
	public void insertar(Paciente paciente) {
		this.pacienteRepo.insertar(paciente);

	}

	@Override
	public void quitar(String cedula) {
		this.pacienteRepo.eliminar(cedula);
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.buscar(cedula);
	}

	@Override
	public void modificar(Paciente paciente) {
		this.pacienteRepo.actualizar(paciente);
	}

}
