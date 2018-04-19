package com.qa.account;

public class Account {
	 private String firstName;
	   private String lastName;
	   private Integer accountNumber;
	   
	   public Account(String firstName, String lastName, Integer accountNumber){
		   this.firstName = firstName;
		   this.lastName = lastName;
		   this.accountNumber = accountNumber;
	   }
	   
	   public String getfirstName(){
		   return firstName;
	   }
	   
	   public void setfirstName(String firstName){
		   this.firstName = firstName;
	   }
	   
	   public String getlastName(){
		   return lastName;
	   }
	   
	   public void setlastName(String lastName){
		   this.lastName = lastName;
	   }
	   
	   public  int getaccountNumber(){
		   return accountNumber;
	   }
	   
	   public void setaccountNumber(){
		   this.accountNumber = accountNumber;
	   }

}
