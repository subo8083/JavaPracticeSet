package com.question4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		//List<String>cities=Arrays.asList("mumbai","delhi","chennai","kolkata","goa");
		
		PrintList pl=cities->{
			
			for(String city:cities)
			{
				System.out.println(city);
			}
		};
		pl.display(Arrays.asList("mumbai","delhi","chennai","kolkata","goa"));

	}

}
