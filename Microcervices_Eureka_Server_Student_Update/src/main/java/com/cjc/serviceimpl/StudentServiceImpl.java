package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;
import com.cjc.servicei.ServiceI;

@Service
public class StudentServiceImpl implements ServiceI {

	@Autowired
	StudentRepository sr;
	
	@Override
	public Student findByRollno(int rollno) {
		
		return sr.findByRollno(rollno);
	}

	@Override
	public void saveData(Student s1) {
		sr.save(s1);
		
	}

	
	
}
