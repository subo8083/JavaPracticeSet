package com.question3;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		HashSet<Book> hs=new HashSet<>();
		
		Book b1=new Book(1,"name1","subo");
		
		Book b2=new Book(2,"name2","subo");
		
		Book b3=new Book(3,"name1","subo");
		
		Book b4=new Book(1,"name1","subo");
		
		Book b5=new Book(1,"name1","subo");
		
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		hs.add(b5);
		
		System.out.println(hs);
		
		System.out.println("=================================================================");
		
		
		MemberShipEndComp mcom=new MemberShipEndComp();
		
		TreeSet <Members> ts=new TreeSet<>(mcom);
		
		Members m1=new Members(1,"Subo",11,"10/10/2021");
		Members m2=new Members(2,"Arman",12,"13/10/2021");
		Members m3=new Members(3,"Dinesh",13,"16/10/2021");
		Members m4=new Members(4,"Kartik",14,"19/10/2021");
		Members m5=new Members(5,"Jay",15,"21/10/2021");
		
		Members m6=new Members(1,"Subo",11,"10/10/2021");
		Members m7=new Members(7,"Subo",11,"10/10/2021");
		
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		ts.add(m4);
		ts.add(m5);
		ts.add(m6);
		ts.add(m7);
		System.out.println(ts);
		
		
		
		
		
		
	}
	
	
	

}
