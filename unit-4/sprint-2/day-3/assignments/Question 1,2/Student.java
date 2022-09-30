package assignment6;

public class Student {
	
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	
	public void setRoll(int roll)
	{
		this.roll=roll;
		
	}
	
	public int getRoll()
	{
		return roll;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
			this.age=age;
	}
	
	public int getAge()
	{
		return age;	
	}
	
	public void setMarks(int marks)
	{
		if(this.marks<0 || this.marks >501)
			System.out.println("enter marks between 1 to 500");
		else
			this.marks=marks;
			
	}
	public int getMarks()
	{
		return marks;
	}
	
	Student(){
		
	}
	
	Student(int roll,String name,int age,int marks){
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	public void showDetails()
	{
		System.out.println("Roll is: "+roll);
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Marks is:"+marks);
	}

}
