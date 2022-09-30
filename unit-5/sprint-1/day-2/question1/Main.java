package com.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void fun1(List<? extends Person> list) {// upper bound is person and person is parent class of student
		
		System.out.println("inside fun1 of Main");
		
		for(Person p:list) {
			
			System.out.println(p);
			
		}
		
		
	}

	public static void main(String[] args) {
		
		List<Student> students=Arrays.asList(new Student(12,98,"ranbir"),new Student(13,95,"kusum"), new Student(14,90,"aarti"));
		
//		List<Student>st=new ArrayList<>();
//		st.add(new Student())
		
		fun1(students);// calling from child class also
		
		List<Person> person=Arrays.asList(new Student(12,98,"ranbir"),new Student(13,95,"kusum"), new Student(14,97,"kabir"));
		
		fun1(person);// Calling from Parent class
		
		

	}

}
