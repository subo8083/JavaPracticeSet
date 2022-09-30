package evaluation2;

import java.util.Scanner;

public class Maain {

	public static Employee getEmployeeDetails()
	{
		Employee e1=new Employee();
		Scanner sc=new Scanner(System.in);
		
		int Id=e1.getEmployeeId();
		String name=e1.getEmployeeName();
		double sal=e1.getSalary();
		
		System.out.println("Enter Id: ");
		Id=sc.nextInt();
		e1.setEmployeeId(Id);
		sc.nextLine();
		System.out.println("Enter Name: ");
		name=sc.next();
		e1.setEmployeeName(name);
		System.out.println("Enter Salary: ");
		sal=sc.nextDouble();
		e1.setSalary(sal);
		sc.nextLine();
		System.out.println("Enter Pf percentage");
		int n=sc.nextInt();
		e1.calculateNetSalary(n);
		double netSal=e1.getNetSalary();
		e1.setNetSalary(netSal);
		return e1;
		
	}
	
	public static void main(String[] args) {
		
		
		Employee e1=Maain.getEmployeeDetails();	
		System.out.println("Id is "+e1.getEmployeeId());
		
		
		System.out.println("Name is "+e1.getEmployeeName());
		System.out.println("Salary is "+e1.getSalary());
		System.out.println("Net salary is "+e1.getNetSalary());
		
		
		
		
		

	}

}
