package com.question4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class Student {

	private int roll;
	private String name;
	private int marks;
	
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student(int rol, String name,int marks) {
		
		this.roll=rol;
		this.name=name;
		this.marks=marks;
		
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	public static HashMap<String,Student> sortMapbyValue(HashMap<String,Student> hm)
	{
		
		Set<Map.Entry<String,Student>> set = hm.entrySet();
		
		List<Map.Entry<String,Student>> list=new LinkedList<Map.Entry<String,Student>>(set);
		
		
		Collections.sort(list,new StudentMarksComp());
		
		
		LinkedHashMap<String, Student>temp=new LinkedHashMap<String,Student>();
		
		for(Map.Entry<String, Student> Stu:list) {
			
			temp.put(Stu.getKey(),Stu.getValue());
		}
		return temp;
		
		
		
	}
	
	public static void main(String[] args) {
		
		HashMap<String, Student> hm = new LinkedHashMap<String, Student>();
		
		hm.put("Karnataka", new Student(10,"Aruna",87));
		hm.put("Tamil Nadu", new Student(11,"Kavita",12));
		hm.put("Mumbai", new Student(12,"Akshay",55));
		hm.put("Delhi", new Student(13,"Rocky",43));
		hm.put("Banaras", new Student(14,"Prem",99));
		
		HashMap<String,Student>HHM=sortMapbyValue(hm);
		
		for(Map.Entry<String, Student> stu:HHM.entrySet()) {
			System.out.println("Keys="+stu.getKey()+" and Values are= "+stu.getValue());
			
		}
		
		
		
	}
	
}
