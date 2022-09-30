package com.question4;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		Set<Student>s=new HashSet();
		
		s.add(new Student(10,98,"subo"));
		s.add(new Student(12,959,"amit"));
		s.add(new Student(14,979,"shyam"));
		s.add(new Student(16,910,"raju"));
		s.add(new Student(18,99,"kirti"));
		
		
		System.out.println("normal set========================");
		for(Student s1:s) {
			System.out.println(s1);
		}
		
		System.out.println("after filtered====================");
		
		Set<Student>s1 =s.stream().filter(stu->stu.getMarks()<500).collect(Collectors.toSet());
		
		for(Student s2:s1) {
			System.out.println(s2);
		}
		
		

	}

}
