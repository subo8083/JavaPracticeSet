package com.question3;

public class Accounts {
	
		String accountNamer;
		double balance;
		
		public Accounts(String acc, double bal) {
			this.accountNamer=acc;
			this.balance=bal;
		}
	
	
	
	public void deposit(double amount) {
		
		balance=balance+amount;
		
	}
	
	public double withdraw(double amount) throws InsufficientFundsException {
		
		balance=balance-amount;
		
		
		if(balance>0)
		{
			System.out.println("Withdrwan: "+amount);
		}
		else
		{
			InsufficientFundsException ie=new InsufficientFundsException();
			throw ie;
		}
		
		return balance;
		
	}

}
