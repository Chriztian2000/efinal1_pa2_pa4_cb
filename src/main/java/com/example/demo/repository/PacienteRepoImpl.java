package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class PacienteRepoImpl implements PacienteRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Paciente paciente) {
		this.entityManager.persist(paciente);		
	}

	@Override
	public void eliminar(String cedula) {
		Paciente paci = this.buscar(cedula);		
		this.entityManager.remove(paci);
		
	}

	@Override
	public Paciente buscar(String cedula) {
		
		return this.entityManager.find(Paciente.class, cedula);
	}

	@Override
	public void actualizar(Paciente paciente) {
		this.entityManager.merge(paciente);
		
	}

}
