package com.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.Bank;

@Repository
public interface BankRepository  extends JpaRepository<Bank, Integer>{
	
	

}
