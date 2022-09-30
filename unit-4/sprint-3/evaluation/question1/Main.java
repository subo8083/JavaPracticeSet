package com.question1;

public class Main {
	
	public Object[] changeArray(Object obj)
	{
		Student s1=new Student();
		Employee e1=new Employee();
//		s1.setRoll(23);
//		s1.setMarks(450);
//		s1.setName("rakesh");
//		
//		e1.setId(12);
//		e1.setName("lokesh");
//		e1.setSalary(84000);
		return null;
				
		
	}
	
	
	public static void main(String[] args)
	{
		
		
		
		
		
		
		Object[] arr=new Object[4];
		
		
		arr[0]=new Student(23,"rakesh",450);
		
		arr[1]=new Employee(12,"lokesh",84000);
		arr[2]="String";
		arr[3]=50;
		
//		Object[] obj=changeArray(arr[0]);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
	}

}
