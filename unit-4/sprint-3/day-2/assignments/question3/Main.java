package com.question3;

public class Main extends Member {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		Manager m1=new Manager();
		e1.name="Shyam";
		e1.address="Dhanbad";
		e1.age=29;
		e1.phoneNumber="98989898";
		e1.Department="Employee";
		e1.salary=202020;
		System.out.println("Department is: "+e1.Department);
		System.out.println("Name is: "+e1.name);
		System.out.println("Address is: "+e1.address);
		System.out.println("Age is: "+e1.age);
		System.out.println("Address is: "+e1.phoneNumber);
		System.out.println("Salary is: "+e1.salary);
		
		System.out.println();
		
		e1.printSalary();
		
		System.out.println("===================================");
		
		m1.name="Devdutt pandey";
		m1.address="Fakauli bazar";
		m1.age=76;
		m1.phoneNumber="876567876";
		m1.Department="Manager";
		m1.salary=19800.87;
		
		System.out.println("Department is: "+m1.Department);
		System.out.println("Name is: "+m1.name);
		System.out.println("Address is: "+m1.address);
		System.out.println("Age is: "+m1.age);
		System.out.println("Address is: "+m1.phoneNumber);
		System.out.println("Salary is: "+m1.salary);
		System.out.println();
		m1.printSalary();
		
		
	}

}
