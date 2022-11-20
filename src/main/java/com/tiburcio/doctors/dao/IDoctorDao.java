package com.tiburcio.doctors.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiburcio.doctors.models.Doctor;

public interface IDoctorDao extends CrudRepository<Doctor, Long>{

}
