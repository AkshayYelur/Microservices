package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	public Student findByRollno(int rollno);
	
}
