package net.ncu.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ncu.springboot.model.Teacher;
import net.ncu.springboot.service.TeacherService;


// Prashant 19csu219


@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
	
	private TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}
	
	
	@PostMapping()
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher){
		return new ResponseEntity<Teacher>(teacherService.saveTeacher(teacher), HttpStatus.CREATED);
	}
	
	
	@GetMapping
	public List<Teacher> getAllTeacher(){
		return teacherService.getAllTeachers();
	}
	
	
	@GetMapping("{id}")
	public ResponseEntity<Teacher> getTeacherById(@PathVariable("id") long teacherId){
		return new ResponseEntity<Teacher>(teacherService.getTeacherById(teacherId), HttpStatus.OK);
	}
	

	@PutMapping("{id}")
	public ResponseEntity<Teacher> updateTeacher(@PathVariable("id") long id
												  ,@RequestBody Teacher teacher){
		return new ResponseEntity<Teacher>(teacherService.updateTeacher(teacher, id), HttpStatus.OK);
	}
	
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteTeacher(@PathVariable("id") long id){
		
	
		teacherService.deleteTeacher(id);
		
		return new ResponseEntity<String>("Teacher deleted successfully!....👍", HttpStatus.OK);
	}
	
}
