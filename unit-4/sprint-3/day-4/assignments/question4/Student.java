package com.question4;
import java.util.Scanner;
public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grades;
	
	Scanner sc=new Scanner(System.in);
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrades() {
		return grades;
	}

	public void setGrades(char grades) {
		this.grades = grades;
	}

	
	public Student(String n, int m,int r)
	{
		this.name=n;
		this.marks=m;
		this.roll=r;
	}
	
	public Student()
	{
		
	}
	private char calculateGrades()
	{
		if(marks>=500)
		{
			return 'A';
		}
		else if(marks<500 && marks>=400)
		{
			return 'B';
		}
		else if(marks<400)
		{
			return 'C';
		}
		return 0;
	}
	
	@Override
	public String toString()
	{
		Student s1=new Student();
		s1.setMarks(marks);
		s1.setName(name);
		s1.setRoll(roll);
		char c=s1.calculateGrades();
		return "details of Students are: Name is:- "+s1.getName()+", roll is:- "+s1.getRoll()+", marks is:- "+s1.getMarks()+", and Grades is:- "+c;
	}
	
	public void displayDetails()
	{
		System.out.println("Enter the name of student ");
		String na=sc.next();
		System.out.println("Enter the Marks ");
		int m=sc.nextInt();
		System.out.println("Enter the roll ");
		int r=sc.nextInt();
		
		Student s1=new Student(na,m,r);
		String str=s1.toString();
		System.out.println(str);
		char c=s1.calculateGrades();
		System.out.println("Grade obtained is  "+c);
		
	}

}
