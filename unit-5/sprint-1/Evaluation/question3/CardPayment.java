package com.question3;

public class CardPayment implements Payment{

	
	private int amount;
	
	CardPayment(int p){
		
		this.amount=p;
	}
	
	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using card "+amount);
	}
	
	
	
	
	
	
}
