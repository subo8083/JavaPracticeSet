package com.question1;

public class Employee {

	private String name;
	private int id;
	private int salary;
	
	
	
	public Employee(int i,String n, int sal)
	{
		this.name=n;
		this.id=i;
		this.salary=sal;
	}
	
	public Employee()
	{
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString()
	{
		return "Employee [ EmployeeId is = "+id+" name = "+name+" salary is = "+salary;
	}
	
	
	
	
}
