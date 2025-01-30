package com.bank.service;

import java.util.List;

import com.bank.model.Bank;


public interface ServiceI {
	
public List<Bank> getAllData();

public Bank findById(int id);

}
