package it.training.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.training.shop.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, String> {
	
	public List<StudentModel> findByAge(int age);
	public List<StudentModel> findByAgeBetween(int age1, int age2);
	public List<StudentModel> findByAgeAndAddress(int age, String address);
	
	//Number
	public List<StudentModel> findByAgeLessThan(int age);
	public List<StudentModel> findByAgeLessThanEqual(int age);
	public List<StudentModel> findByAgeGreaterThan(int age);
	public List<StudentModel> findByAgeGreaterThanEqual(int age);
	
	// Text
	public List<StudentModel> findByNameContainingOrderByAgeDesc(String text); // มีคำต่อไปนี้
	public List<StudentModel> findByNameStartingWith(String text); //เริ่มต้นด้วยคำต่อไปนี้
	public List<StudentModel> findByNameEndingWith(String text); // ลงท้ายด้วยคำต่อไปนี้
	
	
	

}
