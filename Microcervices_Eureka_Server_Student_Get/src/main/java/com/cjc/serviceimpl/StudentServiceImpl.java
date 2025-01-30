package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;
import com.cjc.servcei.StudentServiceI;

@Service
public class StudentServiceImpl  implements StudentServiceI{

	@Autowired
	StudentRepository sr;
	
	@Override
	public List<Student> findAllData() {
		
		return sr.findAll();
	}

	@Override
	public Student findByRollno(int rollno) {
		
		return sr.findByRollno(rollno);
	}

}
