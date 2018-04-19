package com.qa.test;
import static org.junit.Assert.*;

import java.util.HashMap;

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
		Account ruben = new Account("Ruben","Caldeira",333);
		service.addAccount(ruben);
		Integer expectedValue =1;
		Integer actualValue =service.getAccountMap().size();
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	public void JSONconversionTest() {
		Account ruben = new Account("Ruben","Caldeira",333);
		service.addAccount(ruben);
		Json ju = new Json();
		String expectedValue = "{\"1\":{\"firstName\":\"Ruben\",\"lastName\":\"Caldeira\",\"accountNumber\":333}}";
		String actualValue = ju.getJSONForObject(service.getAccountMap());
		System.out.println(ju.getJSONForObject(service.getAccountMap()));
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	public void searchMapForNameTest() {
		Account ruben = new Account("Ruben", "Caldeira", 333);
		Account ruben2 = new Account("Ruben", "Caldeira", 332);
		Account ruben3 = new Account("Ruben", "Caldeira", 331);
		service.addAccount(ruben);
		service.addAccount(ruben2);
		service.addAccount(ruben3);
		HashMap <Integer, Account> myMap = service.getAccountMap();
		int expectedValue = 3;
		int actualValue = service.searchMapForName("Ruben", myMap);
		assertEquals(expectedValue,actualValue);
		
		
	}
	
	
}
		
		

	

