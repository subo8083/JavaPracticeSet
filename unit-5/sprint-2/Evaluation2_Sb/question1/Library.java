package com.question1;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	static List<Book>list=new ArrayList();

	
	void addBook(Book book)throws BookException{
		
		
		
		for(Book b:list) {
			
			if(b.getIsbn()!=book.getIsbn())
			{
				list.add(book);
				System.out.println("Book Added Succeffsully");
			}
			else
			{
				BookException be= new BookException();
				throw be;
			}
		}
		
		
	}
	
		List viewAllBooks()throws BookException{
		
		if(list.size()>0)
		{
			return list;
			
		}
		else
		{
			BookException ae=new BookException();
			throw ae;
		}
		
	}
		
		
	
	

}
