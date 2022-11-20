package com.tiburcio.doctors.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "prescriptions")
public class Prescription implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	@DateTimeFormat(iso = ISO.DATE)
	private Date date;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	private Doctor doctor;

	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	private Patient patient;
	
	@JsonProperty("idDoctor")
	public long getIdDoctor() {
		return doctor.getId();
	}
	
	@JsonProperty("idPatient")
	public long getIdPatient() {
		return patient.getId();
	}
	
	public Prescription() {
		super();
	}

	public Prescription(Date date, Doctor doctor, Patient patient) {
		super();
		this.date = date;
		this.doctor = doctor;
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
