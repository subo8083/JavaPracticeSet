package com.question2;

public class ThreadA extends Thread {
	
	
	int pro=1;
	@Override
	public void run() {
		
		synchronized(this) {
		for(int i=1;i<=10;i++)
		{
			pro = pro*i;
		}
	
		this.notify();
		}
	}

}
