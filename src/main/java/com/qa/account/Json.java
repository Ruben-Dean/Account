package com.qa.account;

import java.util.HashMap;

import com.google.gson.Gson;

public class Json {
	

private  Gson gson; 
	
	public Json() {
		this.gson = new Gson();
		
	}
	
	public String getJSONForObject(Object obj) {
		return gson.toJson(obj);
	}
	public <T> T getObjectForJSON(String jsonString, Class<T> clazz) {
		return gson.fromJson(jsonString, clazz);
	}
	
	
}
