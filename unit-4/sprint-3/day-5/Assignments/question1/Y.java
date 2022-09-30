package com.question1;

public interface Y {

	public abstract void fun4();
	
	
	public default void fun5() {
		
		System.out.println("Inside fun5() of Y default");
		
	}
	
	public static void fun6(){
		System.out.println("inside fun6() of Y static");
		
	}
	
}
