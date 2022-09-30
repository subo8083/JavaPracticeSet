package com.question1;

public class ThreadA extends Thread{
	
	A a;
	B b;
	
	public ThreadA(A a, B b) {
		this.a=a;
		this.b=b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		a.funA(b);

		
	}

}
