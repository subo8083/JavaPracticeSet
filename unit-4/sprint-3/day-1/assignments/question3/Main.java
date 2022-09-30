package com.question3;

public class Main {
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and return array of prime
		//numbers
		//if no prime number is found then return the empty array.
		int[] arrOfPrime=new int[inputArray.length-5];
		int n=0;
		
		for(int i=0;i<inputArray.length;i++)
		{
			boolean flag=true;
			for(int j=2;j<inputArray[i];j++)
			{
				if(inputArray[i]%j==0)
				{
					flag=false;
					break;
				}
				
			}
			if(flag==true)
			{
				arrOfPrime[n]=inputArray[i];
				n++;
			}
		}
		if(arrOfPrime.length>0)
			return arrOfPrime;
		else
			return null;
		
		
}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create the object of Main class
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		int[] arr = {10,12,5,50,11,14,15};
		Main m1=new Main();
		int[] arrays=m1.findAndReturnPrimeNumbers(arr);
		if(arrays!=null)
		{
			System.out.println("Prime numbers are:");
			for(int i:arrays)
			{
				System.out.println(i);
			}
		}
		else
		{
			System.out.println("Prime number not found in the supplied array");
		}
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
		//message:
		// "Prime number not found in the supplied Array"
	}

}
