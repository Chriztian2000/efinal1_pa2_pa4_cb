package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CitaMedicaRepo;
import com.example.demo.repository.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaService {

	@Autowired
	private CitaMedicaRepo citaMedicaRepo;

	@Override
	public void implementar(CitaMedica citamedica) {
		this.citaMedicaRepo.insertar(citamedica);
	}

}
