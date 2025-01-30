package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Bank;
import com.bank.service.ServiceI;

@RestController
public class BankController {

	@Autowired
	ServiceI s;
	
	@PostMapping("/savedata")
	public String inserBankData(@RequestBody Bank b) {
		
		s.insertData(b);
		return "saveData";
	}
	
	
}
