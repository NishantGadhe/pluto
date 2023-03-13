package com.technosignia.pluto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.pluto.Entity.PatientDetails;

@Repository
public interface PatientRepository extends JpaRepository<PatientDetails, Long>{

}
