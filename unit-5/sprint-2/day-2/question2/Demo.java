package com.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		
		List<String>list=new ArrayList();
		list.add("mumbai");
		list.add("delhi");
		list.add("agartala");
		list.add("durg");
		list.add("banaras");
		
		Collections.sort(list, (s1,s2)->s1.compareTo(s2)>s2.compareTo(s1)?-1:1);
		System.out.println(list);
	}

}
