package com.question6;

public class CommerceStudent implements Student {
	
	
	private int accountMarks;
	private int economicsMarks;
	private int businessStudiesMarks;
	
	
	public int getAccountMarks() {
		return accountMarks;
	}
	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}
	public int getEconomicsMarks() {
		return economicsMarks;
	}
	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}
	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}
	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}
	
	
	
	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		double sum=0;
		double per=(accountMarks+economicsMarks+ businessStudiesMarks/300);
		return per;
	}
	
	

}
