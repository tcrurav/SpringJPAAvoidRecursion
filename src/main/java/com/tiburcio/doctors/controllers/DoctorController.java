package com.tiburcio.doctors.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tiburcio.doctors.models.Doctor;
import com.tiburcio.doctors.models.Patient;
import com.tiburcio.doctors.services.IDoctorService;

@RestController
public class DoctorController {
	
	@Autowired 
	private IDoctorService doctorService;
	
	@GetMapping(path = "/doctors")
	public List<Doctor> getAll(){
		return doctorService.getAll();
	}
	
	@PostMapping(path = "/doctors")
	public Doctor create(Doctor doctor) {
		return doctorService.create(doctor);
	}
	
	@PostMapping(path = "/doctors/add_patient")
	public void addPatient(@RequestParam(value = "idDoctor") long idDoctor, @RequestParam(value = "idPatient") long idPatient) {
		doctorService.addPatient(idPatient, idDoctor);
	}
	
	@GetMapping(path = "/doctors/{idDoctor}/patients")
	public List<Patient> getPatients(@PathVariable(value = "idDoctor") long idDoctor) {
		return doctorService.getPatients(idDoctor);
	}
}
