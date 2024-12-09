package com.anu.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		/*
		 * // TODO Auto-generated method stub
		 * Consumer<Integer>consumer=i->System.out.println("Print: "+i);
		 * consumer.accept(10);
		 */
		 
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6);
		list.stream().forEach(i->System.out.println("Print: "+i));

	}

}
