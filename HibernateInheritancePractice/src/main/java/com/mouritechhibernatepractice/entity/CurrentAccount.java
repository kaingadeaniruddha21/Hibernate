package com.mouritechhibernatepractice.entity;



import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cAccount")
public class CurrentAccount extends BankAccount {
	
	@Column(name = "bank_serviceCharge")
	private int serviceCharge;
	
	
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}


	public CurrentAccount(int serviceCharge) {
		super();
		this.serviceCharge = serviceCharge;
	}


	public int getServiceCharge() {
		return serviceCharge;
	}


	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	

}