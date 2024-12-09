package com.anu.java.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	public static List<Employee> evaluteTaxUsers(String input) {
		/*
		 * if(input.equalsIgnoreCase("tax")) { return
		 * DataBase.getEmployees().stream().filter(t->t.getSalary()>50000).collect(
		 * Collectors.toList()); }else return
		 * DataBase.getEmployees().stream().filter(t->t.getSalary()<=50000).collect(
		 * Collectors.toList());
		 */
		return input.equalsIgnoreCase("tax")
				? DataBase.getEmployees().stream().filter(t -> t.getSalary() > 50000).collect(Collectors.toList())
				:
				DataBase.getEmployees().stream().filter(t -> t.getSalary() <= 50000).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(evaluteTaxUsers("tax"));

	}
}
