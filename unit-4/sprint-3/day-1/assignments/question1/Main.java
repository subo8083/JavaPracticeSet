package com.question1;
import java.util.Scanner;

public class Main {
	
	public static String reversString(String originalString){
		
		String str="";
		char[] chr= originalString.toCharArray();		
			for(int i=chr.length-1;i>=0;i--)
			{
				str=str+chr[i];
			}
			return str;
			
		}
	
	
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
		}

}
