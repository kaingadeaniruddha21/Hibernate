package com.mouritechhibernatepractice.entity;




import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "bank")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Acctype",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "bankaccount")
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String AccNo;
	private String AccName;
	private Double Balance;
	private Double Deposit;
	private Double Withdrawl;
	
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}


	public BankAccount(String accNo, String accName, Double balance, Double deposit, Double withdrawl) {
		super();
		AccNo = accNo;
		AccName = accName;
		Balance = balance;
		Deposit = deposit;
		Withdrawl = withdrawl;
	}


	public String getAccNo() {
		return AccNo;
	}


	public void setAccNo(String accNo) {
		AccNo = accNo;
	}


	public String getAccName() {
		return AccName;
	}


	public void setAccName(String accName) {
		AccName = accName;
	}


	public Double getBalance() {
		return Balance;
	}


	public void setBalance(Double balance) {
		Balance = balance;
	}


	public Double getDeposit() {
		return Deposit;
	}


	public void setDeposit(Double deposit) {
		Deposit = deposit;
	}


	public Double getWithdrawl() {
		return Withdrawl;
	}


	public void setWithdrawl(Double withdrawl) {
		Withdrawl = withdrawl;
	}


	@Override
	public String toString() {
		return "BankAccount [AccNo=" + AccNo + ", AccName=" + AccName + ", Balance=" + Balance + ", Deposit=" + Deposit
				+ ", Withdrawl=" + Withdrawl + "]";
	}
	
	
	
	
}
