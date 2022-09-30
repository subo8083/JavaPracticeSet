package com.question2;
import java.util.Scanner;
public class Demo {
	
	public Hotel provideFood(int amt)
	{
		Hotel h1=null;
		if(amt>1000)
		{
			h1=new TajHotel();
		}
		else if(amt>200 && amt<=1000)
		{
			 h1=new RoadSideHotel();
		}
		return h1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d1=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amount=sc.nextInt();
		Hotel h=d1.provideFood(amount);
		if(h!=null)
		{
			h.chickenBiryani();
			h.masalDosa();
			if(h instanceof TajHotel)
			{
				TajHotel t=(TajHotel)h;
				t.welcomeDrink();
			}
		}
		else
			System.out.println("Enter Valid Amount i.e, above 200");
		
		

	}

}
