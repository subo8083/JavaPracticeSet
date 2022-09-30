package com.question2;

public class Student {
	
	private int id;
	private int marks;
	private String name;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
	public Student(int id, int m,String n) {
		
		this.id=id;
		this.marks=m;
		this.name=n;
	}
	
	
	

}
