package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bank.model.Bank;
import com.bank.service.ServiceI;

@RestController
public class BankController {
	
	@Autowired
	ServiceI s;
	
	@Autowired
	RestTemplate rt;
	
	@PutMapping("/updata/{id}")
	public String updateData(@PathVariable("id") int id,@RequestBody Bank b) {
		String url="http://192.168.1.36:8081/getbyid/"+id;
		Bank b1=rt.getForObject(url, Bank.class);
		
		b1.setName(b.getName());
		
	s.updateData(b1);
		return "updated data";
	}
	
	
		

}
