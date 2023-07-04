package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface DoctorService {
	
	public void insertar(Doctor doctor);
	public void quitar(String cedula);
	public Doctor seleccionar (String cedula);
	public void modificar (Doctor doctor);

}
