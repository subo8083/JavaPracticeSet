package com.question1;

import java.util.Objects;

public class Book {
	
	private int bookId;
	private String bookName;
	private String author;
	
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Book(int id,String Book,String auth)
	{
		this.bookId=id;
		this.bookName=Book;
		this.author=auth;
		
	}
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return  bookId == other.bookId;
				
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
	
	
	
	
	
	
	
	

}