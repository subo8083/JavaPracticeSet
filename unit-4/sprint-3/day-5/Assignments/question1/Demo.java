package com.question1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		X x1=new ZImpl();
		x1.fun1();
		x1.fun2();
		X.fun3();
		//X completed
		System.out.println("=================================================================");
		
		Y y1=new ZImpl();
		y1.fun4();
		y1.fun5();
		Y.fun6();
		ZImpl z=(ZImpl)y1;
		z.ownFunction();
		// Y completed
		
		System.out.println("====================================================================");
		
		Z z1=new ZImpl();
		z1.fun7();
	}

}
