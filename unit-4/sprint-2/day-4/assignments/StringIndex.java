package assignment7;
import java.util.Scanner;

public class StringIndex {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter the character position you want to access:");
		int n=sc.nextInt();
		sc.nextLine();
		
		char[] chr=str.toCharArray();
		for(int i=0;i<chr.length-1;i++)
		{
			if(i==n)
			{
				System.out.println("Character at position 2 is: "+chr[i]);
				break;
			}
		}
	}

}
