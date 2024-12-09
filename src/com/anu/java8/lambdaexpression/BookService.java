package com.anu.java8.lambdaexpression;

import java.util.Collections;
import java.util.List;

public class BookService {

	public List<Book> getBooksInSort(){
		List<Book>books=new BookDao().getBooks();
		//Collections.sort(books, new MyComparator());
//		Collections.sort(books, new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		Collections.sort(books,(o1,o2)->o1.getName().compareTo(o2.getName()));
			return books;
	}
	public static void main(String[] args) {
		System.out.println(new BookService().getBooksInSort());
	}
}
	//we implement separate class for compare because comparator is function interface
//	class MyComparator implements Comparator<Book>{
//		public int compare(Book o1, Book o2) {
//			return o1.getName().compareTo(o2.getName());
//		}
	//}

