package com.patientmanagement.doctorpatientapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patientmanagement.doctorpatientapi.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	
}
