package com.anu.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class PedicateDemo {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub Predicate<Integer> predicate = i -> i % 2
		 * == 0; System.out.println(predicate.test(8));
		 */
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6);
		list.stream().filter(i -> i % 2 == 0).forEach(i->System.out.println("print even"+i));
	}

}
