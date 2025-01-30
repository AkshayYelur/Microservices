package com.cjc.admission.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/getadm")
	public String getAdm() {
		
		return "this is addmission page";
	}
}
