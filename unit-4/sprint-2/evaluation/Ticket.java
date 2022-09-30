package evaluation2;

import java.util.Scanner;

public class Ticket {
	
	int ticketId;
	int price;
	static int availableTickets=25;
	
	public int calculateTicketCost(int noOfTickets)
	{
		availableTickets=availableTickets-noOfTickets;
		if(availableTickets>0)
		{
			return noOfTickets*price;
		}
		else
			return -1;
		
	}
		
	public static void main(String[] args)
	{
		Ticket t1=new Ticket();
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter no of bookings: ");
		int book=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter available tickets: ");
		availableTickets=sc.nextInt();
		sc.nextLine();
		
		
		for(int i=0;i<book;i++)
		{
			System.out.println("enter the ticket Id: ");
			t1.ticketId=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the price: ");
			t1.price=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter number of tickets: ");
			int n=sc.nextInt();
			sc.nextLine();
			
			System.out.println("total available tickets: "+availableTickets);
			int total=t1.calculateTicketCost(n);
			System.out.println("Total amount: "+total);
			
			System.out.println("available tickets after booking: "+availableTickets);
			System.out.println("=====================================================");
			
		}
		
		
	}
}
