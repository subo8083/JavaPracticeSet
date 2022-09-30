package com.question4;

import java.util.Scanner;

public class checkNum {

	public static void main(String[] args) {
		System.out.println("Enter two number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			
			System.out.println("The quotient of /b is: "+a/b);
		}
		catch(ArithmeticException e){
			System.out.println("DividedByZeroException caught");
			
			
			
		}
		System.out.println("Inside Finally block");

	}

}
