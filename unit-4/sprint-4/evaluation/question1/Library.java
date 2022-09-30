package com.question1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSet<Book> bookCollections=new LinkedHashSet<>();
		
		bookCollections.add(new Book(1,"Name1","Author1"));
		bookCollections.add(new Book(2,"Name2","Author1"));
		bookCollections.add(new Book(3,"Name1","Author1"));
		bookCollections.add(new Book(1,"Name4","Author2"));
		
		System.out.println("Collections of books are: ");
		
		for(Book b:bookCollections)
		{
			System.out.println(b);
		}
		
		
	}

}
