package com.question4;

import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		
		
//		LinkedHashSet<Product> lhs=new LinkedHashSet<>();
		Ecommerce ecom=new Ecommerce();
		ecom.addProductToList(new Product("Shoes",2000,"Adidas",12));
		
		
		
		ecom.addProductToList(new Product("Ipad",100000,"Apple",2));
		ecom.addProductToList(new Product("Ipad",100000,"Apple",2));
		System.out.println(ecom.showAllProduct());
		

	}

}
