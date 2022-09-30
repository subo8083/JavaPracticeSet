package com.question4;

public class RohitThread extends Thread{
	
	DhoniThread d;
	
	public RohitThread(DhoniThread d) {
		this.d=d;
	}
	
	@Override
	public void run() {
		
		
		try {
			d.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		int p=1;
		for(int i=1;i<=10;i++)
		{
			p=p*i;
		}
		System.out.println("From Rohit: "+p);
		System.out.println("===========================");
		
		
	}

}
