package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;

public interface DoctorRepo {	
	
	public void insertar(Doctor doctor);
	public void eliminar(String cedula);
	public Doctor buscar (String cedula);
	public void actualizar (Doctor doctor);

}
