package com.question4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number upto which you want to print Prime number: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] ar=t.display(n);
		System.out.println("Prime numbers are: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		

	}

}
