package it.training.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.training.shop.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, String> {
	

}
