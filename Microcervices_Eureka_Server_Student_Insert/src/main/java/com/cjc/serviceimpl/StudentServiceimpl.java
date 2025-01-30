package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;
import com.cjc.servicei.StudentServiceI;

@Service
public class StudentServiceimpl implements StudentServiceI {

	@Autowired
	StudentRepository sr;
	
	@Override
	public void insertData(Student s) {
		sr.save(s);
		
	}

	
	
	
	

}
