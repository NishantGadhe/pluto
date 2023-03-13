package com.technosignia.pluto.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InsuranceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String companyname;
	
	private String coverages;
	
	private Long insurancecover;
	
	private String expirydate;
	
	private Long policyno;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCoverages() {
		return coverages;
	}

	public void setCoverages(String coverages) {
		this.coverages = coverages;
	}

	public Long getinsurancecover() {
		return insurancecover;
	}

	public void setinsurancecover(Long insurancecover) {
		this.insurancecover = insurancecover;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	
	public Long getPolicyno() {
		return policyno;
	}

	public void setPolicyno(Long policyno) {
		this.policyno = policyno;
	}

	
}
