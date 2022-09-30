package com.question5;

public interface Vehicle {
	
	public  abstract void run();
	
	
	public default void service()
	{
		System.out.println("Car needs service");
	}


}
