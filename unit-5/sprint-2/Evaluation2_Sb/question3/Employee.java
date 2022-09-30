package com.question3;

public class Employee {
	
	private int empId;
	private int salary;
	private String name;
	private String address;
	
	
	public Employee(int id,int sal, String n, String add) {
		
		this.empId=id;
		this.salary=sal;
		this.address=add;
		this.name=n;
		
	}
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
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



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
