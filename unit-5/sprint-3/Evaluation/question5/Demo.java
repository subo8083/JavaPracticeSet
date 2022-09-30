package com.question5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws Exception {
		
//		File f=new File("c://Student.txt");
//		try {
//			f.createNewFile();
//			System.out.println("file created");
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c://file/studentdata.txt"));
		
		
		List<Student>list=new ArrayList();
		list.add(new Student(10,"ankush",98,"ankush@gmail.com","123456",new Address("Karnatka","banglore","878787")));
		list.add(new Student(11,"rajni",96,"rajni@gmail.com","12345",new Address("UP","banaras","878832")));
		list.add(new Student(12,"tamni",92,"tamni@gmail.com","123",new Address("Bihar","magadh","878654")));
		list.add(new Student(13,"jitu",95,"jitu@gmail.com","9876",new Address("Jharkhand","dhanbad","879896")));
		list.add(new Student(14,"harsh",100,"harsh@gmail.com","121212",new Address("Chattisgarh","Bhilai","834002")));
		
		oos.writeObject(list);
		oos.close();
		System.out.println("done");
		
		
	}

}
