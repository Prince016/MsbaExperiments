package org.test;

import org.dao.CourseDao;
import org.dao.InstructorDao;

public class InstructorTest {
	
	// ---------> Prashant 19csu219 <----------

	public static void main(String[] args) {
		 InstructorDao insDao = new InstructorDao(); 
		 CourseDao dao = new CourseDao(); 
		 dao.create();
//		 insDao.create();
	}
}