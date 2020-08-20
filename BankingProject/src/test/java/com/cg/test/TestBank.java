package com.cg.test;

import org.junit.Test;


import com.cg.exception.MinimumBalanceException;
import com.cg.model.Address;
import com.cg.model.Customer;
import com.cg.service.BankService;
import com.cg.service.BankServiceImpl;

public class TestBank {
	
	public BankService bank;
	
	public TestBank()
	{
		bank = new BankServiceImpl();
	}
	
	@Test 
	(expected=(MinimumBalanceException.class))
	public void checkAccountCreation() throws MinimumBalanceException
	{
		Customer cusomer = new Customer();
		cusomer.setCustomerId(1001);
		cusomer.setName("Shah");
		cusomer.setAddress(new Address("Kolkata","Bengal"));
		
		bank.createAccount(cusomer,500);
		
	}

}
