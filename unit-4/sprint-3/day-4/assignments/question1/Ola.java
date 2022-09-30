package com.question1;

public class Ola extends Car{
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{
		if(numberOfPassenger<=3)
		{
			HatchBack h1=new HatchBack();
			h1.setNoOfPassenger(numberOfPassenger);
			h1.setNoOfKms(numberOfKMs);
			return h1;
		}
		else
		{
			Sedan s1=new Sedan();
			s1.setNoOfPassenger(numberOfPassenger);
			s1.setNoOfKms(numberOfKMs);
			return s1;
			
		}
			
	}
	
	public int calculateBill(Car car)
	{
		int total=0;
		if(car instanceof HatchBack)
		{
			HatchBack h1=(HatchBack)car;
			total=h1.getNoOfKms()*h1.farePerKm;
		}
		else
		{
			Sedan s1=(Sedan)car;
			total=s1.getNoOfKms()*s1.farePerKm;
		}
		return total;
		
		
	}
}
