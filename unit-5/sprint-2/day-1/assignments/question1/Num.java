package com.question1;

import java.util.Scanner;

public class Num {
	
	public static void main(String[] args)
	{
		
		System.out.println("enter the integer: ");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		
		try {
			int n=Integer.parseInt(str);
			
			System.out.println("Square number is: "+n*n);
			
			
		}
		catch(NumberFormatException nfe) {
			System.out.println("Enter correct number");
		}
		
		System.out.println("Work done successfully");
		
		
		
	}

}
