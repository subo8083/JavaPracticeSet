package com.question2;

import java.util.TreeMap;

public class Student {
	
	private int roll;
	private int marks;
	private String name;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}
	
	Student(int r, int m, String n){
		
		this.roll=r;
		this.marks=m;
		this.name=n;
	}
	
	
	
	public static void main(String[] args) {
		
		TreeMap<Student,String>tm=new TreeMap(new StudentMarksComp());
		
		tm.put(new Student(10,50,"arjun"), "bihar");
		tm.put(new Student(12,98,"kumar"), "karnataka");
		tm.put(new Student(14,40,"kavita"), "jharkhand");
		tm.put(new Student(15,60,"krishna"), "punjab");
		
		System.out.println(tm);
		
		
		
		
		
		
		
		
		
	}
	

}
