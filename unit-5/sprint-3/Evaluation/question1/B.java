package com.question1;

public class B {
	
public synchronized void funB(A a1) {
		
		System.out.println("Inside funA()");
		a1.fun1();
		
	}
	public synchronized void fun2() {
		System.out.println("Inside Fun2");
		
	}

}
