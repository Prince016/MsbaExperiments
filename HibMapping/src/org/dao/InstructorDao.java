package org.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.entity.Course;
import org.entity.Instructor;
import org.entity.InstructorDetail;


public class InstructorDao {
	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	
	// ---------> Prashant 19csu219 <----------
	
	public void create() {
		
		Instructor ins = new Instructor("Nick", "Jonas", "nickjn@ncu.edu");
		
		InstructorDetail ins_detail = new InstructorDetail("www.jonasnick.com", "New York");
		
		ins.setInstructorDetail(ins_detail);
		
		Course c1 = new Course("XYZ", 10);
		
		List<Course> course = new ArrayList<Course>();
		course.add(new Course("Big Data", 35));
		course.add(new Course("French", 50));
		course.add(new Course("ITP", 45));
		
		ins.setCourses(course);
		
		Session session = sessionFactory.openSession();
	
		session.beginTransaction();
		
		session.save(ins);
		
		session.getTransaction().commit();
		
		session.close();
		System.out.println("Data saved succcessfully!!");
	}
	
	
	public void read() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}

}