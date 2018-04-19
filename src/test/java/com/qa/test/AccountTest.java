package com.qa.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.account.Account;
import com.qa.account.Json;
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
		Integer expectedValue =1;
		Integer actualValue =service.getAccountMap().size();
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	public void JSONconversionTest() {
		Account Ruben = new Account("Ruben","Caldeira",333);
		service.addAccount(Ruben);
		Json ju = new Json();
		String expectedValue = "{\"1\":{\"firstName\":\"Ruben\",\"lastName\":\"Caldeira\",\"accountNumber\":333}}";
		String actualValue = ju.getJSONForObject(service.getAccountMap());
		System.out.println(ju.getJSONForObject(service.getAccountMap()));
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	public void searchMapForNameTest() {
		Account Ruben = new Account("Ruben", "Caldeira", 333);
		service.addAccount(Ruben);
		int expectedValue = 1;
		int actualValue = service.searchMapForName();
		System.out.println(service.searchMapForName());
		assertEquals(expectedValue,actualValue);
		
		
	}
	
	
}
		
		

	

