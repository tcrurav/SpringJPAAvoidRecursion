package com.tiburcio.doctors.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiburcio.doctors.models.Patient;

public interface IPatientDao extends CrudRepository<Patient, Long>{

}
