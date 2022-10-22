package org.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.entity.Course;
import org.entity.Instructor;
import org.entity.InstructorDetail;

public class CourseDao {
SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

// ---------> Prashant 19csu219 <----------
	
	public void create() {
		
		Course c1 = new Course("Introduction to Java", 40);
		Course c2 = new Course("Introduction to Python", 30);
		
		Instructor ins = new Instructor("Enola", "Holmes", "enoh@ncuindia.edu");
		
		c1.setInstructor(ins);
		c2.setInstructor(ins);
		
		Session session = sessionFactory.openSession();
	
		session.beginTransaction();
		
		session.save(c1);
		session.save(c2);
		
		session.getTransaction().commit();
	
		session.close();
		System.out.println("Data saved succcessfully!!");
	}
}