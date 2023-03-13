package com.technosignia.pluto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.pluto.Entity.PatientDetails;
import com.technosignia.pluto.Repository.PatientRepository;

@Service
public class PatientdetailsService {

	@Autowired
	PatientRepository patientdetailsRepository;
	
	public PatientDetails createpatientdetails(PatientDetails patient) {
		
		return patientdetailsRepository.save(patient);
	}

	public Optional<PatientDetails> getpatientdetailsByID(Long id) {
		
		return patientdetailsRepository.findById(id);
	}

	public PatientDetails updatepatientdetailsByID(Long id, PatientDetails patient) {
		
		Optional<PatientDetails> op = patientdetailsRepository.findById(id);
		
		PatientDetails patientDB = op.get();
		
		if(patient.getAge()!=null) patientDB.setAge(patient.getAge());
		
		if(patient.getName()!=null) patientDB.setName(patient.getName());
		
		if(patient.getGender()!=null) patientDB.setGender(patient.getGender());
		
		if(patient.getContactno()!=null) patientDB.setContactno(patient.getContactno());
		
		if(patient.getVisittype()!=null) patientDB.setVisittype(patient.getVisittype());
		
		if(patient.getInsurancedetails()!=null) patientDB.setInsurancedetails(patient.getInsurancedetails());
		
		return patientdetailsRepository.save(patientDB);
	}

	public String deletepatientdetailsByID(Long id) {
		
		Optional<PatientDetails> op2 = patientdetailsRepository.findById(id);
		
		if(op2.isPresent()) {
			patientdetailsRepository.deleteById(id);
			
			return "Data deleted successfully";
		}
		else return "Data does not exist";
	}
}
