package com.question3;

public class Student {
	
	private int roll;
	private int marks;
	private String name;
	private String address;
	
	
	public Student(int roll,int marks,String name,String address) {
		
		this.roll=roll;
		this.marks=marks;
		this.name=name;
		this.address=address;
		
		
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + ", address=" + address + "]";
	}








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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
