package com.question2;

import java.util.TreeSet;

public class Student {
	
	private int rollNo;
	private String name;
	private int mathMarks;
	private int scienceMarks;
	private int engMarks;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathMarks=" + mathMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + "]"+"\n";
	}


	public Student(int r, String n, int Mm,int Sm, int Em)
	{
		this.engMarks=Em;
		this.mathMarks=Mm;
		this.name=n;
		this.rollNo=r;
		this.scienceMarks=Sm;
	}

	
	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}




	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}




	public int getMathMarks() {
		return mathMarks;
	}



	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}




	public int getScienceMarks() {
		return scienceMarks;
	}



	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}






	public int getEngMarks() {
		return engMarks;
	}






	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}



	public int totalMarks()
	{
		int total=engMarks+mathMarks+scienceMarks;
		return total;
	}



	public static void main(String[] args)
	{
		
		
		StudentMarksComp mcom=new StudentMarksComp();
		TreeSet<Student>ts=new TreeSet<>(mcom);
		ts.add(new Student(1,"Suraj",1,2,3));
		ts.add(new Student(2,"Suraj Pandirt",1,2,3));
		ts.add(new Student(3,"Birla",1,2,3));
		
		System.out.println("After Sorting: ");
		
		System.out.println(ts);
		
		
		
	}


	


}
