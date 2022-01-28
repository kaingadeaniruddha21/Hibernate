package com.training.crudwithhibernate.service;

import java.util.Scanner;

import com.training.crudwithhibernate.dao.CustomerDao;
import com.training.crudwithhibernate.entity.Customer;

public class CustomerService {
	static Scanner sc = new Scanner(System.in);
	CustomerDao custdao = new CustomerDao();

	public void customerSave() {
		Customer cust = new Customer();
		System.out.println("Enter the details of the customer");
		//sc.nextLine()
		System.out.println("Enter the customer name....");
		cust.setCustName(sc.nextLine());
		System.out.println("Enter the customer email....");
		cust.setCustEmail(sc.nextLine());
		System.out.println("Enter the customer mobile number....");
		cust.setCustMobileNo(sc.nextLine());
		custdao.customerSave(cust);	
	}

	public void getAllCustomer() {
		
		custdao.getAllCustomer();
	}
	
	public void deleteCustomer() {

		System.out.println("Enter the customer id to delete....");
		Long custid = sc.nextLong();
		custdao.deleteCustomer(Customer.class,new Long(custid));
	}

	public void updateCustomer() {
		Customer cust = new Customer();
		System.out.println("Enter the details of the customer");
		//sc.nextLine()
		System.out.println("Enter the customer name....");
		cust.setCustName(sc.nextLine());
		System.out.println("Enter the customer email....");
		cust.setCustEmail(sc.nextLine());
		System.out.println("Enter the customer mobile number....");
		cust.setCustMobileNo(sc.nextLine());
		//empdao.employeeSave(emp);	
		//empdao.updateEmployee(emp);
	}
	
	public  void getDetailsToUpdate() {
		System.out.println("Enter the customer id....");
		Long custid = sc.nextLong();
		System.out.println("Enter the mobile no");
		String mobNo = sc.next();
		//return mobNo;
		custdao.updateCustomer(custid,mobNo);
	}

	public void getCustomerById() {
		System.out.println("Enter the employee id....");
		Long custid = sc.nextLong();
		custdao.getCustomerById(custid);
	}

	public void deleteCustomer1() {
		System.out.println("Enter the customer id....");
		Long custid = sc.nextLong();
		custdao.deleteCustomer1(custid);
		
	}

}