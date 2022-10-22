package org.com.ncu.RestfulServicesController;

import java.util.List;

import org.com.ncu.RestfulServicesModel.Teacher;
import org.com.ncu.RestfulServicesService.TeacherService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
	
	//----------- Prashant 19csu219  ---------

	TeacherService teacherService = new TeacherService();

	@RequestMapping(value = "/teachers", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Teacher> getCountries() {
		List<Teacher> listOfTeachers = teacherService.getAllTeachers();
		return listOfTeachers;
	}

	@RequestMapping(value = "/teacher/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Teacher getTeacherById(@PathVariable int id) {
		return teacherService.getTeacher(id);
	}

	@RequestMapping(value = "/teachers", method = RequestMethod.POST, headers = "Accept=application/json")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		return teacherService.addTeacher(teacher);
	}

	@RequestMapping(value = "/teachers", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		return teacherService.updateTeacher(teacher);

	}

	@RequestMapping(value = "/teacher/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteTeacher(@PathVariable("id") int id) {
		teacherService.deleteTeacher(id);

	}	
}
