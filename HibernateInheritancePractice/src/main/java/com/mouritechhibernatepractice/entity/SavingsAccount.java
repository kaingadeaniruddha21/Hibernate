package com.mouritechhibernatepractice.entity;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("sAccount")
public class SavingsAccount extends BankAccount {
	
	@Column(name = "bank_interestRate")
	private int interestRate;
	
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}


	public SavingsAccount(int interestRate) {
		super();
		this.interestRate = interestRate;
	}


	public int getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	

}