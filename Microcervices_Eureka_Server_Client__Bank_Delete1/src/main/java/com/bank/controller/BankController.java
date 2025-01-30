package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bank.model.Bank;
import com.bank.service.ServiceI;
import com.netflix.discovery.converters.Auto;

@RestController
public class BankController {

	@Autowired
	ServiceI s;
	
	@Autowired
	RestTemplate rt;
	
	@DeleteMapping("/deleted/{id}")
	public String delete(@PathVariable("id") int id) {
		
		String url="http://desktop-0v8csem:8081/getbyid/"+id;
		Bank b1 =rt.getForObject(url, Bank.class);
		s.delete(b1);
	
		return "deleted data";
		
	}
	
}
