package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DoctorRepo;
import com.example.demo.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public void insertar(Doctor doctor) {
		this.doctorRepo.insertar(doctor);
	}

	@Override
	public void quitar(String cedula) {
		this.doctorRepo.eliminar(cedula);
	}

	@Override
	public Doctor seleccionar(String cedula) {
		return this.doctorRepo.buscar(cedula);
	}

	@Override
	public void modificar(Doctor doctor) {
		this.doctorRepo.actualizar(doctor);
	}

}
