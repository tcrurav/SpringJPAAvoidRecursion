package com.tiburcio.doctors.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiburcio.doctors.models.Prescription;

public interface IPrescriptionDao extends CrudRepository<Prescription, Long>{

}
