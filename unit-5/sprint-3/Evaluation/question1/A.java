package com.question1;

public class A {
	
	public synchronized void funA(B b1) {
		
		System.out.println("Inside funA()");
		b1.fun2();
		
	}
	public synchronized void fun1() {
		System.out.println("Inside Fun1");
		
	}

}
