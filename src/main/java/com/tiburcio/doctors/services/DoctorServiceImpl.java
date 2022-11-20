package com.tiburcio.doctors.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.doctors.dao.IDoctorDao;
import com.tiburcio.doctors.dao.IPatientDao;
import com.tiburcio.doctors.models.Doctor;
import com.tiburcio.doctors.models.Patient;

@Service
public class DoctorServiceImpl implements IDoctorService{
	
	@Autowired
	private IDoctorDao doctorDao;
	
	@Autowired
	private IPatientDao patientDao;

	@Override
	public List<Doctor> getAll() {
		return (List<Doctor>) doctorDao.findAll();
	}

	@Override
	public Doctor create(Doctor doctor) {
		return doctorDao.save(doctor);
	}

	@Override
	public void addPatient(long idPatient, long idDoctor) {
		Optional<Doctor> d = doctorDao.findById(idDoctor);
		Optional<Patient> p = patientDao.findById(idPatient);
		if(d.isPresent() && p.isPresent()) {
			Doctor doctor = d.get();
			Patient patient = p.get();
			
			Set<Patient> patients = doctor.getPatients();
			patients.add(patient);
			doctor.setPatients(patients);
			doctorDao.save(doctor);
		}
	}

	@Override
	public List<Patient> getPatients(long idDoctor) {		
		Optional<Doctor> d = doctorDao.findById(idDoctor);
		if(d.isPresent()) {
			List<Patient> patients = new ArrayList<Patient>(d.get().getPatients());
			return patients;
		}
		
		return null;
	}
}
