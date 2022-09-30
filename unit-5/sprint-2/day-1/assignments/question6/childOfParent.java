package com.question6;

public class childOfParent {

	public static void main(String[] args) {
		
		Parent p1;
		try {
			p1 = new Parent();
			p1.fun1();
		} catch (Exception e1) {

			e1.printStackTrace();
		}
	}

}
