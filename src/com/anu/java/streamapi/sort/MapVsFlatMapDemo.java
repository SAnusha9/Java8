package com.anu.java.streamapi.sort;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapDemo {
	public static void main(String[] args) {
		List<Customer>customers=EkartDataBase.getAll();
		//List<Customer> covert List<String> -> Data transfermation
		//customer-> customer.getEmail() ---one to one mapping
		
		List<String>emails=customers.stream().map(customer-> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		
		//customer-> customer.getPhoneno() --- one to many mapping
		// here you get stream of stream value as output
		
		List<List<String>>phoneno=customers.stream().map(customer-> customer.getPhoneno()).collect(Collectors.toList());
		System.out.println(phoneno);
		
		//List<Customer> covert List<String> -> Data transfermation
		//mapping : customer-> phone numbers
		//customer-> customer.getPhoneno()----- one to many mapping
		//hera you get stream value as out put
		List<String> PhoneNumbers=customers.stream().flatMap(customer-> customer.getPhoneno().stream()).collect(Collectors.toList());
		System.out.println(PhoneNumbers);
	}

}
