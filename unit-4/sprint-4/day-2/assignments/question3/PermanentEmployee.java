package com.question3;

public class PermanentEmployee extends Employee {
	
	private double basicPay;
	
	
	
	public PermanentEmployee(int ei, String en,double bp) {
		super(ei, en);
		
		this.basicPay=bp;
		
	}
	

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicpay(double basicPay) {
		this.basicPay = basicPay;
	}

	
	
	
	










	@Override
	public void caculateSalary() {
		
		double pfAmount=(basicPay*0.12);
		salary=basicPay-pfAmount;
		setSalary(salary);
	}
	
	
	
	
	

}
