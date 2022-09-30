package com.question3;

public class TemporaryEmployee extends Employee {

	
	public TemporaryEmployee(int ei, String en,int hWorked,int hWages) {
		super(ei, en);
		this.hoursWorked=hWorked;
		this.hourlyWages=hWages;
		
	}
	


	private int hoursWorked;
	private int hourlyWages;
	
	
	
	public int getHoursWorked() {
		return hoursWorked;
	}



	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}








	public int getHourlyWages() {
		return hourlyWages;
	}








	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}








	@Override
	public void caculateSalary() {
	
		salary = hoursWorked *hourlyWages;
		setSalary(salary);

		
	}
	
	
	
	
}
