package com.anu.java.streamapi.sort;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer= new Customer(10,"john","john@gmail.com",Arrays.asList("3928344232","9876543210"));
		
		Optional<Object> emptyOptional=Optional.empty();
		System.out.println(emptyOptional);
		
		Optional<String> emOptional=Optional.of(customer.getEmail());
		System.out.println(emOptional);
		
		Optional<String>eOptional=Optional.ofNullable(customer.getEmail());
		System.out.println(eOptional);
		

	}

}
