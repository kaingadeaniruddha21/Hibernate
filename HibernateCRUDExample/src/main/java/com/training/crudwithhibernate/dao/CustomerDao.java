package com.training.crudwithhibernate.dao;

import java.io.Serializable;
import java.util.List;
import java.util.function.Consumer;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.crudwithhibernate.entity.Customer;
import com.training.crudwithhibernate.service.CustomerService;
import com.training.crudwithhibernate.util.HibernateUtil;




public class CustomerDao {

	
	public void employeeSave(Customer cust) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(cust);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public void getAllCustomer() {
		// retrieve the data from database to java program using hibernate
		//Transaction transaction = null;
				try (Session session = HibernateUtil.getSessionFactory().openSession()) {

					List<Customer> customerList = session.createQuery("from Customer", Customer.class).list();
					customerList.forEach(new Consumer<Customer>() {
						@Override
						public void accept(Customer stud) {
							System.out.println(stud);
						}
					});

				} catch (Exception e) {
					e.printStackTrace();
				}
				
		
	}
	public void deleteCustomer1(Long empid) {
		Transaction transaction1 = null;
		try (Session session1 = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction1 = session1.beginTransaction();
			Customer deletecust = session1.get(Customer.class, custid);
			System.out.println(deleteCust);
			if(deleteCust!=null) {
				session1.delete(deleteCust);
				System.out.println("Customer deleted successfully");
			}
			
			/*
			 * Employee emp2 = new Employee(); emp2.setEmpId(empid); session1.delete(emp2);
			 * System.out.println("Employee deleted"); transaction1.commit();
			 */
			transaction1.commit();
			
		}catch (Exception e) {
			if (transaction1 != null) {
				transaction1.rollback();
			}

			e.printStackTrace();
		}
		
	}
	public void deleteCustomer(Class<?> type,Serializable custid) {
		Transaction transaction1 = null;
		try (Session session1 = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction1 = session1.beginTransaction();
			Customer cust = session1.get(Customer.class, custid);
			System.out.println(cust);
			if(cust!=null) {
				session1.remove(cust);
				System.out.println("Customer deleted successfully");
			}
			
			/*
			 * Employee emp2 = new Employee(); emp2.setEmpId(empid); session1.delete(emp2);
			 * System.out.println("Employee deleted"); transaction1.commit();
			 */
			transaction1.commit();
			
		}catch (Exception e) {
			if (transaction1 != null) {
				transaction1.rollback();
			}

			e.printStackTrace();
		}
		
	}

	public void updateCustomer(Long custid,String mobNo) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			Customer updatingCust = session.get(Customer.class, custid);
			System.out.println(updatingCust);
			//do changes
			updatingCust.setCustMobileNo(mobNo);
			//update the Employee object
			session.saveOrUpdate(updatingCust);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		
	}

	public void getCustomerById(Long custid) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			Customer custById = session.get(Customer.class, custid);
			if(custById!=null) {
				
				System.out.println("Customer details are = " + custById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public void deleteByName(String custName) {
		Transaction transaction1 = null;
		try (Session session1 = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction1 = session1.beginTransaction();
			//String deleteSql = "Delete from Employee Where empName = :empName";
			Query<Customer> deleteQuery = session1.createQuery
					("delete from Customer where custName = :custName");
			deleteQuery.setParameter("custName",custName);
			int deleteStatus = deleteQuery.executeUpdate();
			System.out.println(deleteStatus);
			transaction1.commit();
			
		}catch (Exception e) {
			if (transaction1 != null) {
				transaction1.rollback();
			}

			e.printStackTrace();
		}
		
	}

}