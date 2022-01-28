package com.training.crudwithhibernate;







import java.util.Scanner;

import com.mouritech.crudwithhibernate.service.EmployeeService;

public class CustomerCRUDExample {

	public static void main(String[] args) {
		char ch = 'y';
		String transaction = null;
		Scanner sc = new Scanner(System.in);
		EmployeeService empService = new EmployeeService();
		while(ch == 'y') {
			System.out.println("Enter the transaction type");
			System.out.println("save : to insert a new employee");
			System.out.println("update : to update an employee");
			System.out.println("delete : to delete an employee");
			System.out.println("getall : to get all employee details");
			System.out.println("get : to get an employee detail");
			transaction = sc.next();
			switch (transaction) {
			case "save":
				empService.employeeSave();
				break;
			case "getall":
				empService.getAllEmployees();
				break;
			case "delete":
				empService.deleteEmployee();
				break;
			case "update":
				empService.getDetailsToUpdate();
				break;
			case "get":
				empService.getEmployeeeById();
				break;
			default:
				System.out.println("Not a valid transaction");
				break;
			}
			System.out.println("Do you want to continue (y-yes/n-no)");
			ch = sc.next().charAt(0);
		}

		sc.close();
	}

}