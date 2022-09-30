package com.question4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start date in dd-mm-yyy format");
		String sDate=sc.next();
		
		System.out.println("Enter the End date in dd-mm-yyy format");
		String eDate=sc.next();
		
		try {
			LocalDate start=LocalDate.parse(sDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate end=LocalDate.parse(eDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			
			//System.out.println(start.getDayOfMonth());
			
			if(start.getYear()>end.getYear())
			{
				System.out.println("End year should not be less than start year");
			}
			else if(start.getYear()==end.getYear() && start.getMonthValue()<end.getMonthValue())
			{
				System.out.println("Enter the start month correctly");
			}
			else if(start.getYear()==end.getYear() && start.getMonthValue()==end.getMonthValue() && start.getDayOfMonth()>end.getDayOfMonth() ){
				System.out.println("Start date should be smaller than the end date");
			}
			else
			{
				Period p=Period.between(start,end);
				
				int y=p.getYears();
				int m=p.getMonths();
				int d=p.getDays();
				
				int wages=((y*365)+(m*31)+(d))*1200;
				System.out.println("Total wages:="+wages);
			}
			
			
			
			
		}catch(Exception e){
			
			System.out.println("Enter the dates in valid format");
			
			
		}

	}

}
