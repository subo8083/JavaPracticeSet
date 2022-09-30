package com.question1;

public interface X {
	
	public abstract void fun1();
	
	
	public default void fun2() {
		
		System.out.println("Inside fun2() of X default");
		
	}
	
	public static void fun3(){
		System.out.println("inside fun3() of X static");
		
	}
	

}
