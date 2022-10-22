package org.com.ncu.RestfulServicesModel;

public class Teacher{
	
	//-----------  Prashant 19csu219  ----------------
	
	int id;
	String teacherName;	
	long salary;
	
	
	
	
	public Teacher() {
		super();
	}
	
	public Teacher(int id, String teacherName, long salary) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	
}