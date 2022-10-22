package org.ncu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ncu.com.Employee;



public class EmployeeDao {
	
	
  SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

//  saving object state into the database
  public void create() {
	  
	  
//	  Employee emp = new Employee("Rock5","delhi5", 50000, "Rock5@xyz.com");
	  
	  Employee emp = new Employee(102,"hero","jaipur", 80000, "hero@xyz.com");

	  
	  
	//step 1: create a new session or open an existing session
		Session session = sessionFactory.openSession();
	
		// step 2: create a transaction boundary
		session.beginTransaction();
		
		// step 3: perform save/insert operation
		session.save(emp);
		
		// step 4: commit the transaction
		session.getTransaction().commit();
		
		// step 5: close the session
		session.close();
		System.out.println("Data saved succcessfully!!");
  }
  
  
  @SuppressWarnings("unchecked")
  public void read() {
	  
	  Session session = sessionFactory.openSession();
      
	  session.beginTransaction();
	  
      List<Employee> employeeList = (List) session.createQuery("from Employee").getResultList();
      System.out.println("*** Employee Details ***");
      
      
      for(Employee employee : employeeList)
      {
          System.out.println("Employee ID   : "+ employee.getEmpNo());
          System.out.println("Employee Name : "+ employee.getEmpName());
          System.out.println("Employee Email  : "+ employee.getEmail());
          System.out.println("Employee Address  : "+ employee.getAddress());
          System.out.println("Employee Salary  : "+ employee.getSalary());

      
      }
      session.getTransaction().commit();
	  
      session.close();
		System.out.println("Data Read  succcessfully!!");
	  
//	  Session session = sessionFactory.openSession();
//		Employee empl = session.get(Employee.class, 11);
//		System.out.println("Student Data is: "+empl);
//		session.close();
//		return empl;
	  
  }
  
  public void update(int id, String name) {
	  

			Session session = sessionFactory.openSession();
		
	
			session.beginTransaction();
			
		
		    Employee emp = (Employee)session.get(Employee.class, id);
			emp.setEmpName(name);
			
		
			session.getTransaction().commit();
			
	
			session.close();
			System.out.println("Updated saved succcessfully!!");
	  
  }
  
  public void delete(int id) {
	  
	  Session session = sessionFactory.openSession();
		
		
		session.beginTransaction();
		
	
	    Employee emp = (Employee)session.load(Employee.class, id);
		
	    session.delete(emp);
	    
		session.getTransaction().commit();
		

		session.close();
		System.out.println("Updated saved succcessfully!!");
  }

}
