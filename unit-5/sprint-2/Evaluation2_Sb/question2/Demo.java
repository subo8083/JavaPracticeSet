package com.question2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		
		
		Predicate<Student>p=s->s.getMarks()<500;
		
		System.out.println("=============Predicate==============");
		System.out.println(p.test( new Student(10,780,"suraj")));
		System.out.println(p.test( new Student(10,300,"suraj")));
		
		
		
		Consumer<Student>consumer=s->{
			
			System.out.println("Id is: "+s.getId());
			System.out.println("Marks is: "+s.getMarks());
			System.out.println("Name is: "+s.getName());
			
			
		};
		
		System.out.println("===============Consumer==============");
		consumer.accept(new Student(12,980,"amar"));
		
		
		Supplier<Student>supp=()->{
			Student s1=new Student(14,765,"Gautam");
			return s1;
		};
		System.out.println("==========Supplier===========");
		System.out.println(supp.get());
		
		
		Function<String,Integer>func=s->{
//			String s1="23";
			int k=Integer.parseInt(s);
			return k;
			
		};
		
		System.out.println("==========Function===========");
		System.out.println(func.apply("23"));
		
	}

}
