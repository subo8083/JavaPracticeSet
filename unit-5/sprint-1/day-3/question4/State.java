package com.question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class State {
	




	public static void main(String[] args) {
		
		List<String>cities=new ArrayList<>();
		cities.add("ranchi");
		cities.add("Tata");
		cities.add("bokaro");
		cities.add("dhanbad");
		
		
		
		
//		Map<String,List<String>>state=new HashMap();
//		state.put("Jharkhand", cities);
//		System.out.println(state);
		
		//with the help of hashMap we cant go for sorting as we have to return output in descending order
		
		//going for TreeMap
		
		
		
		TreeMap<String,List<String>>state=new TreeMap<>(new StateComp());
		state.put("jharkhand", cities);

		state.put("uttar pradesh",Arrays.asList("Noida","banaras","prayagraj","lucknow"));
	

		state.put("bihar", Arrays.asList("Gaya","Patna","Aurangabad","sasaram"));
		
		
		System.out.println(state);
		
		

	}

}
