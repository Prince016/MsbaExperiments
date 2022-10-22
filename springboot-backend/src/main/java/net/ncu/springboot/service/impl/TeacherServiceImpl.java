package net.ncu.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import net.ncu.springboot.exception.ResourceNotFoundException;
import net.ncu.springboot.model.Teacher;
import net.ncu.springboot.repository.TeacherRepository;
import net.ncu.springboot.service.TeacherService;

// Prashant 19csu219

@Service
public class TeacherServiceImpl implements TeacherService{

	private TeacherRepository teacherRepository;
	
	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher getTeacherById(long id) {

		return teacherRepository.findById(id).orElseThrow(() -> 
						new ResourceNotFoundException("Teacher", "Id", id));
		
	}

	@Override
	public Teacher updateTeacher(Teacher teacher, long id) {
		
		
		Teacher existingTeacher = teacherRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Teacher", "Id", id)); 
		
		existingTeacher.setFirstName(teacher.getFirstName());
		existingTeacher.setLastName(teacher.getLastName());
		existingTeacher.setEmail(teacher.getEmail());
	
		teacherRepository.save(existingTeacher);
		return existingTeacher;
	}

	@Override
	public void deleteTeacher(long id) {
		
	
		teacherRepository.findById(id).orElseThrow(() -> 
								new ResourceNotFoundException("Teacher", "Id", id));
		teacherRepository.deleteById(id);
	}
	
}
