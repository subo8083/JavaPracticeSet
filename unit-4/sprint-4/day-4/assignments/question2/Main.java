package com.question2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		
		System.out.println("Enter the Employee name 1:");
		String name=sc.next();
		e1.setEmpName(name);
		System.out.println("Enter emp Id");
		int id=sc.nextInt();
		e1.setEmpId(id);
		System.out.println("enter salary");
		double sal=sc.nextInt();
		e1.setSalary(sal);
		
		
		System.out.println("Enter the Employee name 2:");
		String name2=sc.next();
		e2.setEmpName(name2);
		System.out.println("Enter emp Id");
		int id2=sc.nextInt();
		e2.setEmpId(id2);
		System.out.println("enter salary");
		double sal2=sc.nextInt();
		e2.setSalary(sal2);
		
		
		System.out.println("Enter the Employee name 3:");
		String name3=sc.next();
		e3.setEmpName(name3);
		System.out.println("Enter emp Id");
		int id3=sc.nextInt();
		e3.setEmpId(id3);
		System.out.println("enter salary");
		double sal3=sc.nextInt();
		e3.setSalary(sal3);
		
		System.out.println("Enter the Employee name 4:");
		String name4=sc.next();
		e4.setEmpName(name4);
		System.out.println("Enter emp Id");
		int id4=sc.nextInt();
		e4.setEmpId(id4);
		System.out.println("enter salary");
		double sal4=sc.nextInt();
		e4.setSalary(sal4);
		
		
		
		EmployeeSalCompare c1=new EmployeeSalCompare();
		TreeSet<Employee>ts=new TreeSet<>(c1);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println(ts);
		
		
	}

}
