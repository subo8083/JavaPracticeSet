package com.question1;

public class ZImpl implements Z {
	
	@Override
	public void fun1() {
		
		System.out.println("Inside fun1() of X of implemented in ZImpl");
		
	}
	@Override
	public void fun4(){
		System.out.println("Inside fun4() of Y of Implemented in ZImpl");
		
	}
	@Override
	public void fun7() {
		System.out.println("Inside fun7() of Z of Implemented in ZImpl");
	}
	
	//from X to override default method
	@Override
	public void fun2(){
		
		System.out.println("Inside fun2() of X default but overriden in ZImpl");
		
	}
	
	public void ownFunction() {
		System.out.println("ZImpl's Own method inside Zimpl");
	}

}
