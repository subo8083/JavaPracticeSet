package com.question1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of passenger");
		int p=sc.nextInt();
		System.out.println("enter no of kms");
		int km=sc.nextInt();
		 Ola myOla=new Ola();
		 Car myCar=myOla.bookCar(p,km);
		 int res=myOla.calculateBill(myCar);
		 System.out.println(res);
		
		
	}

}
