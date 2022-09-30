package com.question5;
import java.util.Scanner;

public class Demo {
	
//	public Student getDetails()
//	{
//		
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg=0;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Students Object need to be Created?");
		int n=sc.nextInt();
		
		Student[] student=new Student[n];
		
		for(int i=0;i<student.length;i++)
		{
			student[i]=new Student();
			System.out.println("Enter Name of student "+i+1);
			String name=sc.next();
			System.out.println("Enter roll number of Student "+i+1);
			int roll=sc.nextInt();
			System.out.println("Enter adress of student "+i+1);
			String add=sc.next();
			System.out.println("Enter Marks of student "+i+1);
			int marks=sc.nextInt();
			student[i].setMarks(marks);
			student[i].setName(name);
			student[i].setRoll(roll);
			student[i].setAddress(add);
			
		}
		for(int i=0;i<student.length;i++)
		{
			String add=student[i].getAddress();
			int marks=student[i].getMarks();
			String name=student[i].getName();
			int roll=student[i].getRoll();
			sum=sum+marks;
			System.out.println("Student "+i+1+ " name is: "+name);
			System.out.println("Student "+i+1+ " address is: "+add);
			System.out.println("Student "+i+1+ " roll is: "+roll);
			System.out.println("Student "+i+1+ " marks is: "+marks);
			
			System.out.println("========================================");
		}
		avg=(sum/student.length);
		System.out.println("average marks is "+avg);
		
		
	}

}
