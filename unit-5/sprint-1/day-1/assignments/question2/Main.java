package com.question2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		
		ProductPriceComp pcom=new ProductPriceComp();
		
		Queue <Product> que=new PriorityQueue<>(pcom);
		
		Scanner sc=new Scanner(System.in);
		
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		
		
			
			System.out.println("Enter product Id");
			int id=sc.nextInt();
			p1.setProductId(id);
			
			System.out.println("Enter product name: ");
			String name=sc.next();
			p1.setProductName(name);
			
			System.out.println("enter product price: ");
			int price=sc.nextInt();
			p1.setProductPrice(price);
			
			
			
			System.out.println("Enter product Id");
			int id2=sc.nextInt();
			p2.setProductId(id2);
			
			System.out.println("Enter product name: ");
			String name2=sc.next();
			p2.setProductName(name2);
			
			System.out.println("enter product price: ");
			int price2=sc.nextInt();
			p2.setProductPrice(price2);
			
			
			
			System.out.println("Enter product Id");
			int id3=sc.nextInt();
			p3.setProductId(id3);
			
			System.out.println("Enter product name: ");
			String name3=sc.next();
			p3.setProductName(name3);
			
			System.out.println("enter product price: ");
			int price3=sc.nextInt();
			p3.setProductPrice(price3);
			
			
			que.offer(p1);
			que.offer(p2);
			que.offer(p3);
		
		
		
		
		Iterator<Product> itr=que.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			
		}
		
		//Product p;
		
//		while((p=que.poll())!=null) {
//			System.out.println(p);
//			
//		}
		
		

	}

}
