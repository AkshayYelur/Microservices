package com.cjc.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/getex")
	public String getExam() {
		
		return "welcme to exam!!!";
	}
}
