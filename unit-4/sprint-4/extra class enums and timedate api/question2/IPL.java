package com.question2;

import java.util.Scanner;

public class IPL {
	
	 public void print(Stadium s) {
		 
		 if(s!=null) {
			 s.message();
		 }
		 else
		 {
			 System.out.println("invalid city");
		 }
		 
	 }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		IPL i1=new IPL();
		System.out.println("Enter the stadium name");
		String str=sc.next();
		
		Stadium s=Stadium.valueOf(str.toUpperCase());
		i1.print(s);
		
//		s.message();
		
		

	}

}
