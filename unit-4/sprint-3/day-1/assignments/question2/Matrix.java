package com.question2;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		System.out.println("Enter the number of coloumn");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				int num=sc.nextInt();
				arr[i][j]=num;
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[j][i]%2==0)
				{
					sum+=arr[j][i];
				}
			}
			System.out.println(sum);
		}
		
	}
	
	

}
