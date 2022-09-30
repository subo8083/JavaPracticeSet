package com.question4;

public class Test implements Intr {
	
	@Override
	public int[] display(int p) {
		// TODO Auto-generated method stub
		int[] arr=new int[7];
		int c=0;
		for(int i=2;i<=p;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				arr[c]=i;
				c++;
			}
		}
		return arr;
	}
	
}
