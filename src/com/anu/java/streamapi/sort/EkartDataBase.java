package com.anu.java.streamapi.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
	
	public static List<Customer>getAll(){
		return Stream.of(
				new Customer(10,"john","john@gmail.com",Arrays.asList("3928344232","9876543210")),
				new Customer(10,"jock","jock@gmail.com",Arrays.asList("4928344232","9876543210")),
				new Customer(10,"jill","jill@gmail.com",Arrays.asList("5928344232","9876543210")),
				new Customer(10,"jimmy","jimmy@gmail.com",Arrays.asList("6928344232","9876543210"))
				).collect(Collectors.toList());
		
	}

}
