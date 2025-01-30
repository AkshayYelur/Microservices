package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Bank;
import com.bank.service.ServiceI;

@RestController
public class BankController {

	@Autowired
	ServiceI s;
	
	@GetMapping("/getdata")
	public List<Bank> getCData(){
		
		return s.getAllData();
	}
	
	@GetMapping("/getbyid/{id}")
	public Bank getBankById(@PathVariable("id") int id) {
		
		Bank b = s.findById(id);
		return b;
	}
	
}
