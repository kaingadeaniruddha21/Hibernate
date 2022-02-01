package com.mouritechhibernatepractice;




import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritechhibernatepractice.entity.BankAccount;
import com.mouritechhibernatepractice.entity.CurrentAccount;
import com.mouritechhibernatepractice.entity.SavingsAccount;
import com.mouritechhibernatepractice.util.HibernateUtil;

public class TestClassPerInheritance {

	public static void main(String[] args) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start the transaction
			transaction = session.beginTransaction();

			BankAccount ba = new BankAccount();
			ba.setAccNo("1234");
			

			SavingsAccount sa = new SavingsAccount();
			sa.setInterestRate(10);
	

			CurrentAccount ca = new CurrentAccount();
			ca.setServiceCharge(25);
		

			// save all the above employee objects in to database
			session.save(ba);
			session.save(sa);
			session.save(ca);
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