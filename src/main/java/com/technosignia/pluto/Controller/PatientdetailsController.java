package com.technosignia.pluto.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.pluto.Entity.PatientDetails;
import com.technosignia.pluto.service.PatientdetailsService;

@RestController 
public class PatientdetailsController {

	@Autowired
	PatientdetailsService patientdetailsService;
	
	@PostMapping("/patientdetails")
	public PatientDetails createpatientdetails(@RequestBody PatientDetails patient) {
		
		return patientdetailsService.createpatientdetails(patient);
	}
	
	@GetMapping("/patientdetails/{id}")
	public Optional<PatientDetails> getpatientdetails(@PathVariable Long id) {
		
		return patientdetailsService.getpatientdetailsByID(id);
	}
	
	@PutMapping("/patientdetails/{id}")
	public PatientDetails updatepatientdetails(@PathVariable Long id, @RequestBody PatientDetails patient){
		
		return patientdetailsService.updatepatientdetailsByID(id,patient);
	}
	
	@DeleteMapping("/patientdetails/{id}")
	public String deletepatientdetails(@PathVariable Long id) {
		
		return patientdetailsService.deletepatientdetailsByID(id);
	}
}
