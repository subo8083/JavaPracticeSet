package com.question1;

public class Main extends Bird{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird b1=new Parrot();
		b1.fly();
		Parrot p1=(Parrot)b1;
		p1.sing();

	}

}
