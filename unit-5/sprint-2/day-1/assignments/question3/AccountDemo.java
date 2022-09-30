package com.question3;

public class AccountDemo {

	public static void main(String[] args)throws InsufficientFundsException {
		
		Accounts ac=new Accounts("12321",500);
		System.out.println("prev balance wass: "+ac.balance);
		ac.deposit(600);
		System.out.println("after depositing: "+ac.balance);
		
		try {
			
			double d=ac.withdraw(2000);
			System.out.println("balance is : "+ d);
			
		}
		catch(InsufficientFundsException e) {
			System.out.println("Inside exception");
		}
		
		System.out.println("end of main");

	}

}
