package com.bank.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bank.model.Bank;
import com.bank.repository.BankRepository;
import com.bank.service.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	BankRepository br;

	@Override
	public void delete(Bank b) {
		br.delete(b);
		
	}

	


	
}
