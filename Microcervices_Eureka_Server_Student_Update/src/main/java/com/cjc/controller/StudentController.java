package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.model.Student;
import com.cjc.servicei.ServiceI;


@RestController

public class StudentController {

	@Autowired
	ServiceI sr;
	
	@Autowired
	RestTemplate rt;
	
	@PutMapping("/update/{rollno}")
	public String  updateRollno(@PathVariable("rollno") int rollno,@RequestBody Student s  ) {
		String url="http://192.168.1.40:9092/getByRollno/"+rollno;
	Student s1=	rt.getForObject(url,Student.class );
		//s1.setRollno(s.getRollno());
		s1.setName(s.getName());
		s1.setMarks(s.getMarks());
		s1.setContact(s.getContact());
		sr.saveData(s1);
		System.out.println(s1);
		return "savedata";
	}
}
