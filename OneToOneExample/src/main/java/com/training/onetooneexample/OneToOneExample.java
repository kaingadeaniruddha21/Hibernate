package com.training.onetooneexample;


import com.training.onetooneexample.dao.EmployeeDao;
import com.training.onetooneexample.model.Employee;
import com.training.onetooneexample.model.Employee_Details;

public class OneToOneExample {

	public static void main(String[] args) {
		Employee emp = new Employee("Rama","Krishna","ramak@gmail.com");
		Employee_Details empdetails = new Employee_Details("cricket","singing");
		emp.setEmpDetails(empdetails);
		
		EmployeeDao empDao = new EmployeeDao();
		empDao.saveEmployee(emp);

	}

}