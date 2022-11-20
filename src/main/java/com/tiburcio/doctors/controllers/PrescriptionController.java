package com.tiburcio.doctors.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tiburcio.doctors.models.Prescription;
import com.tiburcio.doctors.services.IPrescriptionService;

@RestController
public class PrescriptionController {

	@Autowired
	private IPrescriptionService prescriptionService;
	
	@GetMapping(path = "/prescriptions")
	public List<Prescription> getAll(){
		return prescriptionService.getAll();
	}

	@PostMapping(path = "/prescriptions")
	public Prescription create(@RequestParam(value = "date") @DateTimeFormat(iso = ISO.DATE) Date date, 
			@RequestParam(value = "idDoctor") long idDoctor,
			@RequestParam(value = "idPatient") long idPatient) {
		return prescriptionService.create(date, idDoctor, idPatient);

	}
}
