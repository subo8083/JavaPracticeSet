package com.question3;

import java.util.concurrent.Callable;

public class ThreadA implements Callable{

	int n;
	
	public ThreadA(int n) {
		
		this.n=n;
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		int p=1;
		
		for(int i=1;i<n;i++)
		{
			p=p*i;
			
		}
		return p;
	}
	

}
