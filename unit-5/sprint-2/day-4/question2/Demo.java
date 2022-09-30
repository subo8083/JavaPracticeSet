package com.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		
		
		List<Student>students=new ArrayList();
		
		students.add(new Student(10,98,"subo"));
		students.add(new Student(11,91,"ravi"));
		students.add(new Student(12,97,"shyam"));
		students.add(new Student(13,95,"raju"));
		students.add(new Student(14,90,"babubhaiya"));
		students.add(new Student(15,92,"kachra"));
		
		
		Optional<Student>opt=students.stream().max((s1,s2)->s1.getMarks()>s2.getMarks()?1:-1);
		System.out.println(opt);
		
		
		
		
	}

}
