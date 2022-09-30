package com.question3;

public class Ximpl implements X{

	@Override
	public int convetStringToNumber(String s) throws NumberFormatException {
		
		int x=0;
		
		if(Integer.parseInt(s)>0 || Integer.parseInt(s)<0) {
			
			x=Integer.parseInt(s);
			
		}
		else
		{
			NumberFormatException nfe=new NumberFormatException();
			throw nfe;
		}
		
	
		
		
		return x;
	}
	

}
