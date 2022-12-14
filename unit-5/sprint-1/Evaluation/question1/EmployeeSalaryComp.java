package com.question1;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeSalaryComp implements Comparator<Map.Entry<Employee,String>> {

	@Override
	public int compare(Entry<Employee, String> o1, Entry<Employee, String> o2) {
		
		return o1.getKey().getSalary()>o2.getKey().getSalary()?1:o1.getKey().getSalary()<o2.getKey().getSalary()?-1:0;
		
	}
	
	
	

}
