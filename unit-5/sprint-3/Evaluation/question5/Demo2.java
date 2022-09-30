package com.question5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception {
	
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("c://file/studentdata.txt"));
		
		List<Student> s=(List<Student>)ois.readObject();
		
		for(Student l:s) {
			System.out.println(l);
		}
		System.out.println("=======================after adding one more object===================");
		
		
		
		Student a=new Student(29,"Subojit",87,"Subojit@gmail.com","878765423",new Address("Jharkhand","Ranchi","874543"));
		s.add(a);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c://file/studentdata.txt"));
		oos.writeObject(a);
		oos.close();
		System.out.println("done");
		
		
		
		
		
	}

}
