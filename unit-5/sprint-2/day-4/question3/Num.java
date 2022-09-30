package com.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Num {

	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(11);
		list.add(14);
		list.add(13);
		
		System.out.println("befor squaring==============");
		System.out.println(list);
		
		List<Integer>l =list.stream().map(s->s*s).collect(Collectors.toList());	
		System.out.println("after squaring==================");
		System.out.println(l);

	}

}
