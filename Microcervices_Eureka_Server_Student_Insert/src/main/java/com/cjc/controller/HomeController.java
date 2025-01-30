package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.servicei.StudentServiceI;

@RestController
public class HomeController {
	
	@Autowired
	StudentServiceI ss;
	
	@PostMapping("/insertstudent")
	public String insertData(@RequestBody Student s) {
		 ss.insertData(s);
		 return "save";
		
	}

}
