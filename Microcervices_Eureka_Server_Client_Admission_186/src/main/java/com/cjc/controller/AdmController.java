package com.cjc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdmController {

	@GetMapping("/getadm")
	public String getadm() {
		return "adm success..";
	}
}
