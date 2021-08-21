package it.training.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.training.shop.model.StudentModel;
import it.training.shop.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	
	public List<StudentModel> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public void addStudent(StudentModel student) {
		studentRepository.save(student);
	}
	
}
