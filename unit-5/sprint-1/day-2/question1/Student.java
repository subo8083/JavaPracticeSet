package com.question1;

public class Student extends Person{
	
	private int marks;
	private int id;
	private String name;
	
	
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Student(int i, int m, String n){
		this .id=i;
		this.marks=m;
		this.name=n;
				
	}
	
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", id=" + id + ", name=" + name + "]";
	}
	
	public void show() {
		System.out.println("Inside show() of MAin OVERRIDEN");
	}
	
	
	

}
