package com.mouritech.hibernateInheritanceexample;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.hibernateInheritanceexample.entity.ContractEmployee;
import com.mouritech.hibernateInheritanceexample.entity.Employee;
import com.mouritech.hibernateInheritanceexample.entity.PermanentEmployee;
import com.mouritech.hibernateInheritanceexample.util.HibernateUtil;

public class TestClassPerInheritance {

	public static void main(String[] args) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start the transaction
			transaction = session.beginTransaction();

			Employee emp = new Employee();
			emp.setEmpName("Rama");

			ContractEmployee cemp = new ContractEmployee();
			cemp.setEmpName("Krishna");
			cemp.setWorkingdays(10);
			cemp.setContractorname("Deva");

			PermanentEmployee pemp = new PermanentEmployee();
			pemp.setEmpName("Shiva");
			pemp.setDepartment("IT Developement");
			pemp.setDesignation("Project Manager");

			// save all the above employee objects in to database
			session.save(emp);
			session.save(pemp);
			session.save(cemp);
			// commit transaction
			transaction.commit();
		  } catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

}