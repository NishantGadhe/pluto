package com.technosignia.pluto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.pluto.Entity.InsuranceDetails;

@Repository
public interface InsuranceRepository extends JpaRepository<InsuranceDetails, Long> {
	

}
