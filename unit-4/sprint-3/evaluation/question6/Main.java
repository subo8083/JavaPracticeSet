package com.question6;
import java.util.Scanner;
public class Main {
	
	public void getStudent(int n)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Student you want percentage: ");
		int x=sc.nextInt();
		if(x==1)
		{
			ArtStudent a1=new ArtStudent();
			System.out.println("Enter the marks for hindi: ");
			int ma1=sc.nextInt();
			a1.setHindiMarks(ma1);
			System.out.println("Enter the marks for english:");
			int ma2=sc.nextInt();
			a1.setEnglishMarks(ma2);
			System.out.println("Enter the marks for history:");
			int ma3=sc.nextInt();
			a1.setEnglishMarks(ma3);
			
			double x1=a1.findPercentage();
			System.out.println("Percentage is: "+x1);
			
		}
		
		else if(x==2)
		{
			ScienceStudent s1=new ScienceStudent();
			System.out.println("Enter the marks for physics: ");
			int ma1=sc.nextInt();
			s1.setPhysicsMarks(ma1);
			
			System.out.println("Enter the marks for chemistry: ");
			int ma2=sc.nextInt();
			s1.setPhysicsMarks(ma2);
			
			System.out.println("Enter the marks for biology: ");
			int ma3=sc.nextInt();
			s1.setPhysicsMarks(ma3);
			
			System.out.println("Enter the marks for Maths: ");
			int ma4=sc.nextInt();
			s1.setPhysicsMarks(ma4);
			
			double x1=s1.findPercentage();
			System.out.println("Percentage is: "+x1);
			
		}
		else if(x==3)
		{
			CommerceStudent c1=new CommerceStudent();
			System.out.println("Enter the marks for acounts: ");
			int ma1=sc.nextInt();
			c1.setAccountMarks(ma1);
			
			System.out.println("Enter the marks for Economics: ");
			int ma2=sc.nextInt();
			c1.setAccountMarks(ma2);
			
			System.out.println("Enter the marks for Business studies: ");
			int ma3=sc.nextInt();
			c1.setAccountMarks(ma3);
			
			double x1=c1.findPercentage();
			System.out.println("Percentage is: "+x1);
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1=new ArtStudent();
		
		Main m1=new Main();
		m1.getStudent(3);
		
		
		

	}

}
