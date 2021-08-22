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
	
	public List<StudentModel> getStudentByAge(int age) {
		return studentRepository.findByAge(age);
	}
	
	public List<StudentModel> getStudentByAgeBetween(int age1, int age2){
		return studentRepository.findByAgeBetween(age1, age2);
	}
	
	public List<StudentModel> getStudentByAgeAndAddress(int age, String address){
		return studentRepository.findByAgeAndAddress(age, address);
	}
	
	
	public List<StudentModel> getStudentByAge(int age, String operator){
		
		if(operator.equals("<")) {
			return studentRepository.findByAgeLessThan(age);
		}else if(operator.equals("<=")) {
			return studentRepository.findByAgeLessThanEqual(age);
		}else if(operator.equals(">")) {
			return studentRepository.findByAgeGreaterThan(age);
		}else if(operator.equals(">=")) {
			return studentRepository.findByAgeGreaterThanEqual(age);
		}else {
			return null;
		}
		
	}
	
	
	public List<StudentModel> searchStudentByName(String text, int type){
		//type 1 = start
		//type 2 = end
		//type 3 = contain
		if(type == 1) {
			return studentRepository.findByNameStartingWith(text);
		}else if(type == 2) {
			return studentRepository.findByNameEndingWith(text);
		}else if(type == 3) {
			return studentRepository.findByNameContainingOrderByAgeDesc(text);
		}else {
			return null;
		}
		
		
	}
	
	
}
