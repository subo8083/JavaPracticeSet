package com.question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		List<Product>products=new ArrayList<>();
		
		products.add(new Product(10,2,100,"LUX"));
		products.add(new Product(15,17,60,"Synthol"));
		products.add(new Product(11,18,500,"Salt"));
		products.add(new Product(12,9,900,"onion"));
		products.add(new Product(19,14,20,"ginger"));
		
		
		
		System.out.println("Unfiltered list");
		 
		for(Product p:products) {
			System.out.println(p);
		}
		
		System.out.println("=====================================================================");
		System.out.println("filtered list");
		
		List<Product>pr=products.stream().filter(s->s.getProductQuantity()>10).collect(Collectors.toList());
		
		for(Product p:pr) {
			System.out.println(p);
		}
		
		System.out.println("======================================================================================");
		
		Collections.sort(pr,(p1,p2)->p1.getProductPrice()>p2.getProductPrice()?1:-1);
		
		System.out.println("sorted list=========================================================================");
		
		for(Product p:pr) {
			System.out.println(p);
		}
		
		
		
	}

}
