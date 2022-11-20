package com.tiburcio.doctors.services;

import java.util.Date;
import java.util.List;

import com.tiburcio.doctors.models.Prescription;

public interface IPrescriptionService {
	public List<Prescription> getAll();
	public Prescription create(Date date, long idDoctor, long idPatient);
}
