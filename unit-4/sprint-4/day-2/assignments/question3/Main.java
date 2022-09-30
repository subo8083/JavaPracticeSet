package com.question3;

public class Main {

	public static void main(String[] args) {
		
		
	Loan loan=Loan.getLoanObject();
	double Pel=loan.calculateLoanAmount(new PermanentEmployee(1,"Name1",1000));
	double Tel=loan.calculateLoanAmount(new TemporaryEmployee(2,"Name2",20,100));
	
	System.out.println("Loan Amount for Permanent Employee => "+Pel);
	System.out.println("Loan Amount for Temporary Employee => "+Tel);
		

	}

}
