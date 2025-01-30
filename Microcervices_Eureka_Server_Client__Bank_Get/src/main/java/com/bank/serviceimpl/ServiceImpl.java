package com.bank.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.Bank;
import com.bank.repository.BankRepository;
import com.bank.service.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	BankRepository br;

	@Override
	public List<Bank> getAllData() {
		
			
		return br.findAll();
		
	}

	@Override
	public Bank findById(int id) {
		
		return br.findById(id);
	} 
	
	

	
}
