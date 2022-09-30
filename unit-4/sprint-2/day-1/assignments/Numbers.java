package assgnmnent4;

public class Numbers {
	
	void check(int n)
	{
		if(n%2==1 && n>0)
		{
			System.out.println(n);
		}
		else if(n%2==0 && n>0)
		{
			while(true)
			{
				if(n%10==0)
				{
					System.out.println(n);
					break;
				}
				else
					n=n+2;
			}
		}
		else if(n<0)
				System.out.println("Error");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers n1=new Numbers();
		n1.check(45);
		n1.check(44);
		n1.check(60);
		n1.check(-3);

	}

}
