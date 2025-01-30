package com.cjc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExController {

	@GetMapping("/getex")
	public String getex() {
		return "exam ..";
	}
	
}
