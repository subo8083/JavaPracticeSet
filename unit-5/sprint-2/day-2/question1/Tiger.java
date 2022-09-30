package com.question1;

public class Tiger extends Animal{

	public Tiger() throws AnimalException {
		super();
		
	}


	@Override
	public void eat() throws AnimalException {
		System.out.println("Tiger is eating");
		
	}
	
	
	public static void main(String[] args) {
		
		
		try {
			Animal a=new Tiger();
			a.eat();
		}
		catch(AnimalException ae) {
			System.out.println(ae);
		}
		
	}
	
	

}
