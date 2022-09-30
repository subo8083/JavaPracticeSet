package assignment5;

public class CheckWheather {
	
	
	
	public static void main(String[] args) {

		//Assume these can have any value:
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
		//print "Let’s stay home." if its raining, snowing or
		//below 50 degrees and print "Let’s go out!" otherwise.
		
		if(isSnowing==true || isRaining==true || temperature<50)
		{
			System.out.println("Lets Stay Home");
		}
		else
			System.out.println("Lets go outside");

	}


}
