package com.cjc.servcei;

import java.util.List;

import com.cjc.model.Student;

public interface StudentServiceI {
	
	
	
	public List<Student> findAllData();
	
	public Student findByRollno(int rollno);

}
