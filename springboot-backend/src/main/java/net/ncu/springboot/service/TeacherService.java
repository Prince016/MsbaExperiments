package net.ncu.springboot.service;

import java.util.List;

import net.ncu.springboot.model.Teacher;


// Prashant 19csu219

public interface TeacherService {
	Teacher saveTeacher(Teacher teacher);
	List<Teacher> getAllTeachers();
	Teacher getTeacherById(long id);
	Teacher updateTeacher(Teacher teacher, long id);
	void deleteTeacher(long id);
}
