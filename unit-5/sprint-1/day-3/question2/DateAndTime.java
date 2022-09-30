package com.question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime {
	
	public static void main(String[] args) {
		
		
		try {
		Scanner sc=new Scanner(System.in);
		
		
		LocalDate curr=LocalDate.now();
		
		System.out.println("enter DOB in dd-mm-yyyy format:");
		String cur=sc.next();
		
		DateTimeFormatter obj=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate ld=LocalDate.parse(cur,obj);
		
		Period diff=Period.between(ld, curr);
		
		if(diff.getYears()>0)
			System.out.println("Your Age is: "+diff.getYears()+" Years and "+diff.getMonths()+" months");
		else
			System.out.println("Date should not be in future");
		
		
		}
		
		catch(Exception e){
			
			System.out.println("enter DOB in valid pattern ");
			
		}
		
		
	}
	
	


}
