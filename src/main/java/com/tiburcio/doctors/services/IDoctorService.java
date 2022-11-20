package com.tiburcio.doctors.services;

import java.util.List;

import com.tiburcio.doctors.models.Doctor;
import com.tiburcio.doctors.models.Patient;

public interface IDoctorService {
	public List<Doctor> getAll();
	public Doctor create(Doctor doctor);
	public void addPatient(long idPatient, long idDoctor);
	public List<Patient> getPatients(long idDoctor);
}
