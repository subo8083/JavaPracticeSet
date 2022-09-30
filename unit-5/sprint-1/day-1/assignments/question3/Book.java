package com.question3;

import java.util.Objects;

public class Book {
	
	private int bookId;
	private String bookName;
	private String bookAuther;
	
	
	Book(int bi,String bn,String ba){
		
		
		this.bookAuther=ba;
		this.bookId=bi;
		this.bookName=bn;
		
	}
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuther=" + bookAuther + "]"+"\n";
		
	}


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


	public String getBookAuther() {
		return bookAuther;
	}


	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
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
		return bookId == other.bookId;
	}
	
	
	
	
	

}
