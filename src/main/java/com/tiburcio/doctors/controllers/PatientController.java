package com.tiburcio.doctors.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiburcio.doctors.models.Patient;
import com.tiburcio.doctors.services.IPatientService;

@RestController
public class PatientController {
	
	@Autowired 
	IPatientService patientService;
	
	@GetMapping(path = "/patients")
	public List<Patient> getAll(){
		return patientService.getAll();
	}
	
	@PostMapping(path = "/patients")
	public Patient create(Patient patient) {
		return patientService.create(patient);
	}
}
