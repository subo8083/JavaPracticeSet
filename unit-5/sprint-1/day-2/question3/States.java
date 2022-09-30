package com.question3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class States {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String>lhm=new LinkedHashMap();
		
		lhm.put("Jharkhand", "Ranchi");
		lhm.put("Karnataka", "Banglore");
		lhm.put("Rajasthan", "Jaipur");
		lhm.put("A.P","Itanagar");
		lhm.put("punjab","Chandigarh");
		
		System.out.println("All the keys: ==========");
		Set<String>keys=lhm.keySet();
		
		for(String s:keys) {
			System.out.println(s);
		}
		
		Collection<String>values=lhm.values();
		
		System.out.println("All values are=========:   ");
		for(String k:values) {
			System.out.println(k);
		}
		
		

	}

}
