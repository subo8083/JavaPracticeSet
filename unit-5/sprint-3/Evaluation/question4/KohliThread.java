package com.question4;

public class KohliThread extends Thread{
	
	RohitThread r;
	
	public KohliThread(RohitThread r) {
		this.r=r;
	}
	
	@Override
	public void run() {
		
		try {
			
			r.join();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i=1;i<=10;i++)
		{
			System.out.println("From kohli"+i);
		}
		
		System.out.println("=========================================");
		
	}

}
