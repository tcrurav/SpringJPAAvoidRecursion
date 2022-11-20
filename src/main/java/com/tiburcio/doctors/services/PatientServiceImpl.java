package com.tiburcio.doctors.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.doctors.dao.IPatientDao;
import com.tiburcio.doctors.models.Patient;

@Service
public class PatientServiceImpl implements IPatientService{
	
	@Autowired
	private IPatientDao patientDao;

	@Override
	public List<Patient> getAll() {
		return (List<Patient>) patientDao.findAll();
	}

	@Override
	public Patient create(Patient patient) {
		return patientDao.save(patient);
	}

}
