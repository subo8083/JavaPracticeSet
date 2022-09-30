package assignmnet6i;

public class Student {

	private int roll;
	private String name;
	private String address;
	private String collegeName;
	
	
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
	
	public void setCollegeName(String collegeName)
	{
		this.collegeName=collegeName;
	}
	public String getCollegeName()
	{
		return collegeName;
	}
	
	public void setAdress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	
	Student(int roll,String name,String address)
	{
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	Student(int roll,String name,String address,String collegeName)
	{
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collegeName=collegeName;
	}
	Student()
	{
		
	}
	
	public static Student getStudent(boolean isFromNIT)
	{
		
		if(isFromNIT==true)
		{
		Student s1=new Student(121,"Suraj","TATA");
		s1.collegeName="NIT";
		return s1;
		}
		else
		{
			Student s1=new Student(155,"Akshay","Odisha","NIST berhampur");
			return s1;
		}
		
		
	}
	public void showDetails()
	{
		System.out.println("roll is: "+roll);
		System.out.println("name is: "+name);
		System.out.println("adress is:"+address);
		System.out.println("college is: "+collegeName);
	}
	
	public static void main(String[] args)
	{
		Student s1=Student.getStudent(false);
		s1.showDetails();
		Student s2=Student.getStudent(true);
		s2.showDetails();
		
		
		
	}

	
	
	
}
