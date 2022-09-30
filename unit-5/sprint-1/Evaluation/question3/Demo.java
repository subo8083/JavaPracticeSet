package com.question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	
	public void doTransaction(List<? extends Payment>list) {
		
		
//		List<CardPayment>l1=Arrays.asList(new CardPayment(7000),new CardPayment(8000));
//		List<CardPayment>l2=Arrays.asList(new CardPayment(6000),new CardPayment(9000));
		
		Payment p1=new CardPayment(7000);
		p1.doPayment();
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		List<CardPayment>l1=Arrays.asList(new CardPayment(7000),new CardPayment(8000));
		List<CardPayment>l2=Arrays.asList(new CardPayment(6000),new CardPayment(9000));
		Demo d2=new Demo();
		d2.doTransaction(l1);
		
	}

}
