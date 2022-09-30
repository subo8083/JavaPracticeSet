package evaluation2;

public class Employee {
	
	 private int employeeId;
	 private String employeeName;
	 private double salary;
	 private double netSalary;
	
	public void calculateNetSalary(int pfPercentage)
	{
		netSalary=salary-(pfPercentage*salary/100);
	}
	
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId=employeeId;
	}
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName=employeeName;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	
	
	public void setNetSalary(double netSalary)
	{
		this.netSalary=netSalary;
	}
	public double getNetSalary()
	{
		return netSalary;
	}

}
