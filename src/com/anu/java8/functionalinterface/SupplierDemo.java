package com.anu.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {
	/*public String get() {
		return "Hello world";
	}

	public static void main(String[] args) {
		Supplier<String> supplier= new SupplierDemo();
		System.out.println(supplier.get());
		// TODO Auto-generated method stub
*/
	public static void main(String[] args) {
		/*
		 * Supplier<String>supplier=()->"Welcome"; System.out.println(supplier.get());
		 */
		List<String>list=Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(()->"Welcome to the world"));
	}

}
