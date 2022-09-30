package assgnment1;

public class assignments {
	
	
	 public static void sumOfNatural(int n) {
		
		int sum=0;
		sum=(n*(n+1))/2;
		System.out.println(sum);
		
		
	}
	 
	 public static void primeFactors(int n)
	 {
		 if(n>1)
		 {
			 for(int i=1;i<=n;i++)
			 {
				 if(n%i==0)
					 System.out.println(i);
				 
			 }
		 }
		 else
			 System.out.println("invalid number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfNatural(6);
		primeFactors(12);
		primeFactors(15);
	}

}
