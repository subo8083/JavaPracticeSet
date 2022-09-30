package com.question3;

public class Loan {
	
	private Loan(){
		
	}
	
	public static Loan getLoanObject() {
		
		return new Loan();
	}
	
	
	
	public double calculateLoanAmount(Employee employeeObj)
	{
		
		if(employeeObj instanceof PermanentEmployee)
		{
			PermanentEmployee p1=(PermanentEmployee)employeeObj;
			p1.caculateSalary();
			double x=p1.salary*.15;
			return x;
		}
		else
		{
			TemporaryEmployee t1=(TemporaryEmployee)employeeObj;
			t1.caculateSalary();
			double x=t1.salary*.10;
			return x;
		}
		
	}

}
