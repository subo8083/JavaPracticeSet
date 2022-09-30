package com.question1;

public class ThreadB extends Thread {

	
	A a;
	B b;
	
	public ThreadB(A a, B b) {
		this.a=a;
		this.b=b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.funB(a);

		
	}
	
	

}
