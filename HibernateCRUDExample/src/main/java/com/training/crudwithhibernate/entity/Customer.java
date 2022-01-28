package com.training.crudwithhibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name = "customer_info")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customerid")
	private Long custId;
	
	@Column(name = "customername")
	@Size(min=3)
	private String custName;
	
	@Column(name = "customeremail")
	@Email
	private String custEmail;
	
	@Column(name = "customermobno")
	@Pattern(regexp = "[0-9]", message="mobile number contains only digits")
	private String custMobileNo;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String custName, String custEmail, String custMobileNo) {
		super();
		this.custName = custName;
		this.custEmail = custEmail;
		this.custMobileNo = custMobileNo;
	}

	public Customer(Long custId, String custName, String custEmail, String custMobileNo) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custMobileNo = custMobileNo;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustMobileNo() {
		return custMobileNo;
	}

	public void setCustMobileNo(String custMobileNo) {
		this.custMobileNo = custMobileNo;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", custMobileNo="
				+ custMobileNo + "]";
	}

	public void customerSave(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}