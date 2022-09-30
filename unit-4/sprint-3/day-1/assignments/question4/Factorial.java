package com.question4;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		
		if(args.length==1)
			{
				int fact=1;
				for(int i=1;i<=n;i++)
				{
					fact=fact*i;
				}
			System.out.println(fact);
			}
		else if(args.length==2)
		{
			int m=Integer.parseInt(args[1]);
			int s=Math.abs(n-m);
			int fact=1;
			for(int i=1;i<=s;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		}
		else if(args.length>2)
			System.out.println("Error");

	}

}
