package com.question3;

public class CashPayment implements Payment{
	
	private int amount;
	
	CashPayment(int p){
		this.amount=p;
		
	}
	
	@Override
	public void doPayment() {
		
		System.out.println("Payment done using cash "+amount);
		
		
	}
	
	
	
	

}
