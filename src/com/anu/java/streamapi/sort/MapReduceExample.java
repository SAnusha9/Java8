package com.anu.java.streamapi.sort;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(2,3,4,5,6,7);
		int sum=0;
		for(int no : numbers) {
			sum=sum+no;
		}
		System.out.println(sum);
		
		int sum1= numbers.stream().mapToInt(i->i).sum();
		System.out.println(sum1);

	}

}
