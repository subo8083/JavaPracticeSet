package assignment5;

public class Check {
	
	void checkvowels(char c)
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
		{
			System.out.println("character is Vowel");
		}
		else
			System.out.println("character is consonent");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c1=new Check();
		c1.checkvowels('a');
		c1.checkvowels('H');
		
		

	}

}
