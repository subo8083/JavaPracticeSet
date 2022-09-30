package com.question2;

public class Main {

	public static void main(String[] args) {
		
		ThreadA t1=new ThreadA();
		
		Thread mt=new Thread(t1);
		
		
		t1.start();
		
		synchronized(t1) {
		try {
			t1.wait();
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
		}
		System.out.println("Product from 1 to 10 is:"+t1.pro);

	}

}
