package com.question5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Product>list=new ArrayList();
		list.add(new Product(10,2,230,"Lux"));
		list.add(new Product(12,5,500,"Synthol"));
		list.add(new Product(14,9,100,"Oil"));
		list.add(new Product(16,1,30,"Salt"));
		list.add(new Product(18,3,789,"Spices"));
		
		Collections.sort(list,(p1,p2)->p1.getProductPrice()>p2.getProductPrice()?-1:p1.getProductPrice()<p2.getProductPrice()?1:0);
		//System.out.println(list);
		
		for(Product s:list) {
			System.out.println(s);
		}
		
		
	}

}
