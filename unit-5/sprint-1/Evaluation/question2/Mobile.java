package com.question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Mobile {
	
	static HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		
		mobiles.put(company,model);
		
		return "Mobile Added Successfully";
		
		
	}
	
	public List<String> getModels(String company){
		
		List<String>s=new ArrayList();
		Set<String>s1=mobiles.keySet();
		for(String str:s1) {
			
			s.add(str);
		}
		return s;
		
		
	}
	
	public static void main(String[] args) {
		
		Mobile m1=new Mobile();
		
//		String s1=m1.addMobile("Apple", "Iphone");
//		String s2=m1.addMobile("Apple", "Iphone3");
//		String s3=m1.addMobile("Samsung", "galaxy5");
//		String s4=m1.addMobile("Xiome", "redmi9");
		
		List<String>models=new ArrayList();
		models.add("Iphone11");
		models.add("iphone12");
		models.add("Iphone13");
		
		mobiles.put("Apple", (ArrayList<String>) models);
		
		
		
		
	}

}
