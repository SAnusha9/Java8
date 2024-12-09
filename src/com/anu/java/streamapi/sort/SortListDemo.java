package com.anu.java.streamapi.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.anu.java.streamapi.DataBase;
import com.anu.java.streamapi.Employee;

public class SortListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(7);
		list.add(12);
		list.add(4);
		List<Employee> employees=DataBase.getEmployees();
		Collections.sort(employees,(o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
		System.out.println(employees);
		employees.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);
		employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);

			
		Collections.sort(list);//Assending
		Collections.reverse(list);//Desending
		System.out.println(list);
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
		 List<Employee> filteredEmployees = employees.stream()
	                .filter(e -> e.getSalary() > 50000)
	                .collect(Collectors.toList());
	
}
}
