package com.question5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		
		int c=1;
		
		String s1="";
		
		List<String> list=new ArrayList<>();
		
		List<String> list2=new ArrayList<>();
		
		System.out.println("Enter the words or Article: ");
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		char[] chr=str.toCharArray();
		
		for(int i=0;i<chr.length;i++)
		{
			if(chr[i]==' ')
			{
				c++;
				list2.add(s1);
				s1="";
				continue;
			}
			else
				s1=s1+chr[i];
				
			
		}
		if(chr.length==0)
		{
			System.out.println("Number of Words is 0");
		}
		else
		System.out.println("Number of Words are: "+c);
		
		
		
			list.add(str);
			LinkedHashSet<String> temp=new LinkedHashSet<>();
		
			for(String s:list2)
			{
				temp.add(s);
			}
		System.out.println("unique words are: "+temp);
		
		

	}

}
