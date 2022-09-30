package com.question1;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	
	
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		
		Set<Map.Entry<Employee,String>>set=originalMap.entrySet();
		
		List<Map.Entry<Employee,String>>list=new LinkedList<Map.Entry<Employee,String>>(set);
		
		Collections.sort(list,new EmployeeSalaryComp());
		
		LinkedHashMap<Employee,String> temp=new LinkedHashMap<Employee,String>();
		
		for(Map.Entry<Employee,String>emp:list) {
			
			temp.put(emp.getKey(), emp.getValue());
			
		}
		return temp;
		
	}
	
	
	public static void main(String[] args) {
		Demo d1=new Demo();
		
		HashMap<Employee,String>hm=new LinkedHashMap<Employee,String>();
		
		hm.put(new Employee(11,"Rupesh",10000),"Samsung" );
		hm.put(new Employee(12,"Jignesh",20000),"Apple" );
		hm.put(new Employee(13,"chinlee",8000),"Xiome" );
		hm.put(new Employee(14,"suraj",15000),"Tata" );
		hm.put(new Employee(15,"sonu",3000),"Mahindra" );
		
		Map<Employee,String>tem=d1.sortMapUsingEmployeeSalary(hm);
		
		for(Map.Entry<Employee, String>emp:tem.entrySet()) {
			
			System.out.println("Key are="+emp.getKey()+" and values are= "+emp.getValue());
			
		}
		
		
	}
	
	
}
