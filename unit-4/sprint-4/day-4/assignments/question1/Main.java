package com.question1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		Product p1=new Product(10,"Soda",10);
		Product p2=new Product(9,"Vicks",16);
		Product p3=new Product(15,"Kurkure",5);
		Product p4=new Product(3,"Hajmola",1);
		
		
		System.out.println("Enter your choice:");
		System.out.println("1 for sorting based on product Id");
		System.out.println("2 for sorting based on Product name");
		System.out.println("3 for sorting based on product price");
		
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			
			
			
			ProductIdCompare pcomp=new ProductIdCompare();
			TreeSet <Product> ts=new TreeSet<>(pcomp);
			
			ts.add(p1);
			ts.add(p2);
			ts.add(p3);
			ts.add(p4);
			
			System.out.println(ts);
			
		}
		else if(choice==2)
		{
			
			ProductNameCompare pNameComp=new ProductNameCompare();
			TreeSet<Product> ts=new TreeSet<>(pNameComp);
			
			ts.add(p1);
			ts.add(p2);
			ts.add(p3);
			ts.add(p4);
			
			System.out.println(ts);
			
			
			
		}
		else
		{
			
			ProductPriceCompare pPrice=new ProductPriceCompare();
			TreeSet<Product>ts=new TreeSet<>(pPrice);
			
			ts.add(p1);
			ts.add(p2);
			ts.add(p3);
			ts.add(p4);
			
			System.out.println(ts);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
