package com.question4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Names {

	public static void main(String[] args) {
		
		
		List<String>names=Arrays.asList("Suraj","Abhilash","Gautam","pankaj","Madhuri","Mayuri","Tripathy","Shyam","Raju","Jitendra");
		
		System.out.println("=====================================Original list=======================");
		
		names.forEach(s->System.out.println(s));
		
		List<String>str=names.stream().filter(s->s.length()%2==0).collect(Collectors.toList());
			
		System.out.println("====================Before uppercasing and filtering out even===============");
		str.forEach(s->System.out.println(s));
		
		
		
		List<String>lst=str.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("================After uppercasing==========================");
		lst.forEach(s->System.out.println(s));
		
		
		Collections.sort(lst,(s1,s2)->s1.compareTo(s2)>s2.compareTo(s1)?1:-1);
		
		System.out.println("===================After Soritng==================");
		
		lst.forEach(s->System.out.println(s));
		
	}
	

}
