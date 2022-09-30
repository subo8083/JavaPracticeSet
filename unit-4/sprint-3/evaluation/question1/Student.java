package com.question1;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	
	
	
	public Student(int r, String n, int m)
	{
		this.roll=r;
		this.name=n;
		this.marks=m;
	}
	public Student()
	{
		
	}
	
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
	
	@Override
	public String toString()
	{
		return "Student [ roll number is = "+roll+" Name is = "+name+" Marks is = "+marks; 
	}

}
