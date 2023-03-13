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

import com.technosignia.pluto.Entity.InsuranceDetails;
import com.technosignia.pluto.service.InsuranceService;

@RestController
public class InsuranceController {

	@Autowired
	InsuranceService insuranceservice;
	
	@PostMapping("/insurancedetails")
	public InsuranceDetails createinsurancedetails(@RequestBody InsuranceDetails insurance) {
		
		return insuranceservice.createinsurancedetails(insurance);
	}
	
	@GetMapping("/insurancedetails/{id}")
	public Optional<InsuranceDetails> getpatientdetails(@PathVariable Long id) {
		
		return insuranceservice.getinsurancedetailsByID(id);
	}
	
	@PutMapping("/insurancedetails/{id}")
	public InsuranceDetails updateinsurancedetails(@PathVariable Long id, @RequestBody InsuranceDetails insurance){
		
		return insuranceservice.updateinsurancedetailsByID(id,insurance);
	}
	
	@DeleteMapping("/insurancedetails/{id}")
	public String deleteinsurancedatails(@PathVariable Long id) {
		
		return insuranceservice.deleteinsurancedetailsByID(id);
	}
}
