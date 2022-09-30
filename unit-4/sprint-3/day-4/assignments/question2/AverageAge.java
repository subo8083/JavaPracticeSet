package com.question2;

import java.util.Scanner;
public class AverageAge {
	
	public double calculateAverage(int[] age)
	{
		double sum=0;
		for(int i=0;i<age.length;i++)
		{
			sum=sum+age[i];
		}
		return sum/(age.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageAge a1=new AverageAge();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of employees: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the age for "+n+" employees: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		if(arr.length>1)
		{
			double res=a1.calculateAverage(arr);
			System.out.println("Average age is: "+res);
			
		}
		else
		{
			System.out.println("Please Enter a valid employee count");
		}
	}

}
