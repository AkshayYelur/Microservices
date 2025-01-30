package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.servcei.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	StudentServiceI sr;
	
	
	@GetMapping("/getallStudent")
	public List<Student> getAllStudent(){
		
	return	sr.findAllData();
		
	}
	
	@GetMapping("/getByRollno/{rollno}")
	public Student getByRollno(@PathVariable("rollno") int rollno){
		
		Student list = sr.findByRollno(rollno);
		
		return list ;
	}
 	
}
