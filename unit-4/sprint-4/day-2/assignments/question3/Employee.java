package com.question3;

public abstract class Employee {
	
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	
	
	public int getEmployeId() {
		return employeeId;
	}
	public void setEmployeId(int employeId) {
		this.employeeId = employeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(int ei,String en)
	{
		this.employeeId=ei;
		this.employeeName=en;
		
	}
	
	public abstract void caculateSalary();
	
	
	

}
