package com.qa.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.account.Account;
import com.qa.account.Service;


public class AccountTest {
	
	Service service;
	
	@Before
	public void setUp() {
		service = new Service();
		
	}
	
	@Test
	public void addAccountTest() {
		Account Ruben = new Account("Ruben","Caldeira",333);
		service.addAccount(Ruben);
		Integer expected=1;
		Integer actual=service.getAccountMap().size();
		assertEquals(expected,actual);
	}
	
	
}
		
		

	

