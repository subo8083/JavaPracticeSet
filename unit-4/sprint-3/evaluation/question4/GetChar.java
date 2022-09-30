package com.question4;


import java.util.Scanner;
public class GetChar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		System.out.println("Enter the position: ");
		int pos=sc.nextInt();
		char[] charArr=str.toCharArray();
		
		if(pos>charArr.length-1)
		{
			System.out.println("Invalid position, enter valid position");
			
		}
		else
		{
		
		for(int i=0;i<charArr.length;i++)
		{
			 if(i==pos)
				{
					System.out.println("Position is: "+charArr[i]);
					break;
				}
			
		}
		

	}
	}
}
