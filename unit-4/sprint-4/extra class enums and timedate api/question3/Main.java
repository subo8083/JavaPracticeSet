package com.question3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in dd-mm-yyyy format");
		String ld=sc.next();
		
		
		
		LocalDate date=LocalDate.parse(ld,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate dd= date.plus(1,ChronoUnit.MONTHS);////Adding Months
		System.out.println(dd);
		
		LocalDate de= date.plus(1,ChronoUnit.WEEKS);//Adding weeks
		System.out.println(de);
		
		LocalDate df= date.plus(1,ChronoUnit.YEARS);//Adding weeks
		System.out.println(df);

	}

}
