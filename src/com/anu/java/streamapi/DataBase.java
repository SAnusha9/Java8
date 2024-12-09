package com.anu.java.streamapi;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	public static List<Employee> getEmployees(){
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(890,"Anusha","admin",60000));
		list.add(new Employee(990,"Srini","IT",80000));
		list.add(new Employee(790,"Chinnu","core",40000));
		list.add(new Employee(690,"Bujjai","Social",50000));
		return list;
	}

}
