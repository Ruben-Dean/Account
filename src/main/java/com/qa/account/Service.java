package com.qa.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Service {

	private static int counter = 0;
	private HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();

	public void addAccount(Account account) {
		if (accountMap.containsKey(account.getaccountNumber())) {
			System.out.println("Account already exsits");
		} else {
			accountMap.put(account.getaccountNumber(), account);
		}
		//

	}

	public Account getAccount(Integer accountNumber) {
		return accountMap.get(accountNumber);
	}

	public void removeAccount(Account account) {
		if (accountMap.containsKey(account.getaccountNumber())) {
			accountMap.remove(account.getaccountNumber());
		} else {
			System.out.println("This account does not exsit");
		}

	}

	public HashMap<Integer, Account> getAccountMap() {
		return accountMap;
	}

	// public static int searchMapForName() {
	// for(int i=0; i<.size();i++) {
	// return 0;
	// }
	public static int searchMapForName(String name, HashMap<Integer, Account> accountMap){
	
		Set<Map.Entry<Integer, Account>> entryAccounts = accountMap.entrySet();
	    for(Map.Entry<Integer, Account> entry : entryAccounts) {
	        
	    	if(entry.getValue().getfirstName().equals(name)) {
	    		counter++;
	    		
	    	}
	    }
	    return counter;
	}

	public void setAccountMap(HashMap<Integer, Account> accountMap) {
		this.accountMap = accountMap;
	}
	
	

	//
}

