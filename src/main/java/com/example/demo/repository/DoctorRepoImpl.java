package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DoctorRepoImpl implements DoctorRepo {

	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public void insertar(Doctor doctor) {
	this.entityManager.persist(doctor);
		
	}

	@Override
	public void eliminar(String cedula) {
		Doctor doc = this.buscar(cedula);
		this.entityManager.remove(doc);
		
	}

	@Override
	public Doctor buscar(String cedula) {
		
		return this.entityManager.find(Doctor.class, cedula);
	}

	@Override
	public void actualizar(Doctor doctor) {
		this.entityManager.merge(doctor);
		
	}

}
