package com.anu.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

	public List<Book> getBooks(){
		List<Book> books= new ArrayList<Book>();
		books.add(new Book(101,"Core Java",400));
		books.add(new Book(102,"Spring",200));
		books.add(new Book(101,"Hibernate",150));
		return books;
		
	}
}
