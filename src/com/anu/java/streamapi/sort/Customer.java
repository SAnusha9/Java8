package com.anu.java.streamapi.sort;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String email;
	private List<String> phoneno;
	
	public Customer() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(List<String> phoneno) {
		this.phoneno = phoneno;
	}

	public Customer(int id, String name, String email, List<String> phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
	}

}
