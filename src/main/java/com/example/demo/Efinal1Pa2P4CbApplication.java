package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.CitaMedicaService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4CbApplication implements CommandLineRunner {

	@Autowired
	private PacienteService pacienteService;

	@Autowired
	private DoctorService doctorService;

	@Autowired
	private CitaMedicaService citaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Paciente paci = new Paciente();
		paci.setNombre("Christian");
		paci.setApellido("Betancourt");
		paci.setCedula("1722781000");
		paci.setCodSeguro("123456");
		paci.setEstatura("1.4 mts");
		paci.setPeso("63 kg");
		paci.setGenero("Masculino");
		
		/*
		this.pacienteService.insertar(paci);
		this.pacienteService.buscar("1722781000");
		this.pacienteService.modificar(paci);
		this.pacienteService.quitar("1722781000");
		
		*/
		

		Doctor doc = new Doctor();
		doc.setCedula("1700000000");
		doc.setNombre("Edison");
		doc.setApellido("Cayambe");
		doc.setNumConsultorio("1A");
		doc.setCodSenesyt("561EC12");
		doc.setGenero("Masculino");
		
		CitaMedica cime= new CitaMedica();
		cime.setNumeroCita("1");
		cime.setValorCita(new BigDecimal(50));
		cime.setLugarCita("Av. Universitaria");
		cime.setDoctor(doc);
		cime.setPaciente(paci);
		this.citaMedicaService.implementar(cime);
		

	}

}
