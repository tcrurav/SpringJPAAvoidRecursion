package com.tiburcio.doctors.services;

import java.util.List;

import com.tiburcio.doctors.models.Patient;

public interface IPatientService {
	public List<Patient> getAll();
	public Patient create(Patient patient);
}
