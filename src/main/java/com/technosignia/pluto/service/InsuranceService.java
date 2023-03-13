package com.technosignia.pluto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.pluto.Entity.InsuranceDetails;
import com.technosignia.pluto.Repository.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	InsuranceRepository insurancerepository;
	
	public InsuranceDetails createinsurancedetails(InsuranceDetails insurance) {
		return insurancerepository.save(insurance);
	}

	public Optional<InsuranceDetails> getinsurancedetailsByID(Long id) {
		
		return insurancerepository.findById(id);
		
	}

	public InsuranceDetails updateinsurancedetailsByID(Long id, InsuranceDetails insurance) {
		
		Optional<InsuranceDetails> op = insurancerepository.findById(id);
		
        InsuranceDetails insuranceDB = op.get();
		
		if(insurance.getCompanyname()!=null) insuranceDB.setCompanyname(insurance.getCompanyname());
		
		if(insurance.getCoverages()!=null) insuranceDB.setCoverages(insurance.getCoverages());
		
		if(insurance.getExpirydate()!=null) insuranceDB.setExpirydate(insurance.getExpirydate());
		
		if(insurance.getinsurancecover()!=null) insuranceDB.setinsurancecover(insurance.getinsurancecover());
		
		if(insurance.getPolicyno()!=null) insuranceDB.setPolicyno(insurance.getPolicyno());
		
		
		return insurancerepository.save(insuranceDB) ;
	}

	public String deleteinsurancedetailsByID(Long id) {
Optional<InsuranceDetails> op2 = insurancerepository.findById(id);
		
		if(op2.isPresent()) {
			insurancerepository.deleteById(id);
			
			return "Data deleted successfully";
		}
		else return "Data does not exist";
	}
}
