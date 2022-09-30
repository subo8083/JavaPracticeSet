package com.question3;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		List<Student>students=new ArrayList();
		students.add(new Student(10,667,"suraj","banglore"));
		students.add(new Student(12,800,"amar","mumbai"));
		students.add(new Student(14,300,"shyam","chennai"));
		students.add(new Student(16,454,"paul","kolkata"));
		
		Employee e=new Employee(30,2000,"kamal","UP");
		
		List<Student>st=students.stream().filter(s->s.getMarks()>500).collect(Collectors.toList());
		
		System.out.println(st);
		
		List<Employee>st2=st.stream().map(s->new Employee(s.getRoll(),s.getMarks()*10000, s.getName(),s.getAddress())).collect(Collectors.toList());
		System.out.println("=========After Transfrom=====================");

		st2.forEach(s->System.out.println(s));
		
		
	}

}
