package com.tiburcio.doctors.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.doctors.dao.IDoctorDao;
import com.tiburcio.doctors.dao.IPatientDao;
import com.tiburcio.doctors.dao.IPrescriptionDao;
import com.tiburcio.doctors.models.Doctor;
import com.tiburcio.doctors.models.Patient;
import com.tiburcio.doctors.models.Prescription;

@Service
public class PrescriptionServiceImpl implements IPrescriptionService{
	
	@Autowired
	private IDoctorDao doctorDao;
	
	@Autowired
	private IPatientDao patientDao;
	
	@Autowired
	private IPrescriptionDao prescriptionDao;

	@Override
	public Prescription create(Date date, long idDoctor, long idPatient) {
		Optional<Doctor> d = doctorDao.findById(idDoctor);
		Optional<Patient> p = patientDao.findById(idPatient);
		if(d.isPresent() && p.isPresent()) {
			Doctor doctor = d.get();
			Patient patient = p.get();
			
			Prescription prescription = new Prescription(date, doctor, patient);

			return prescriptionDao.save(prescription);
		}
		return null;
	}

	@Override
	public List<Prescription> getAll() {
		return (List<Prescription>) prescriptionDao.findAll();
	}

}
