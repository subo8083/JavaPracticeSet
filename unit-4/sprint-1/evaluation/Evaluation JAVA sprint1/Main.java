package evaluation;

public class Main {
	
	static void printMonths(String months)
	{
		switch(months)
		{
		case "January":
			System.out.println("This is the 1st month of year January");
			break;
		case "February":
			System.out.println("This is the 2nd month of year February");
			break;
		case "March":
			System.out.println("This is the 3rd month of year March");
			break;
		case "April":
			System.out.println("This is the 4th month of year April");
			break;
		case "May":
			System.out.println("This is the 5th month of year May");
			break;
			
		case "June":
			System.out.println("This is the 6th month of year June");
			break;
			
		case "July":
			System.out.println("This is the 7th month of year July");
			break;
		
		case "August":
			System.out.println("This is the 8th month of year August");
			break;
			
		case "September":
			System.out.println("This is the 9th month of year September");
			break;
			
		case "October":
			System.out.println("This is the 10th month of year October");
			break;
			
		case "November":
			System.out.println("This is the 11th month of year November");
			break;
			
		case "December":
			System.out.println("This is the 12th month of year December");
			break;
			
		}
	}
	
	
	public static void main(String[] args)
	{
		printMonths("January");
		printMonths("December");
		printMonths("July");
	}

}
