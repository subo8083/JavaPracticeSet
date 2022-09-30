package com.question5;

import java.util.Scanner;

public class UserRegistration {
	
	public void registerUser(String userName, String userCountry)throws InvalidCountryException
	{
		
			if(userCountry.equals("India")) {
				System.out.println("User registration done successfully");
			}
			else
			{
				
				InvalidCountryException e=new InvalidCountryException();
				throw e;
					
			}
	}
	public static void main(String[] args) 
	{
		
		UserRegistration ur=new UserRegistration();
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Enter your country:");
		String coun=sc.next();
		
		try {
		ur.registerUser(name, coun);
		}
		catch(InvalidCountryException e) {
			System.out.println("User Outside India cannot be registered");
		}
		System.out.println("Thank you");
		
		
		
	}

}
