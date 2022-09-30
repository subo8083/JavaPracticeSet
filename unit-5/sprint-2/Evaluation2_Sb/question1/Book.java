package com.question1;

public class Book {
	
	private int isbn;
	String bookName;
	String Author;
	
	
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", Author=" + Author + "]";
	}
	
	
	

}
