package com.question4;

public class Main {

	public static void main(String[] args) {
		
		DhoniThread d=new DhoniThread();
		RohitThread r=new RohitThread(d);
		KohliThread k=new KohliThread(r);
		
		d.setPriority(10);
		r.setPriority(5);
		k.setPriority(1);
		
		
		
		d.start();
		r.start();
		k.start();
		
		

	}

}
