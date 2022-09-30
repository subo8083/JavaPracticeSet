package com.question4;

public class DhoniThread extends Thread {
	
	@Override
	public void run() {
		
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("From dhoni:"+sum);
		System.out.println("=================================");
		
	}

}
