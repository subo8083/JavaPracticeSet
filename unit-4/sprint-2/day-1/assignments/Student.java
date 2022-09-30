package assgnmnent4;

public class Student {
	int roll;
	String name;
	int marks;
	
	static void dis()
	{
		System.out.println("-------------------------");
	}
	
	void displayStudentDetails()
	{
		System.out.println("Roll is: "+roll);
		System.out.println("Name is: "+name);
		System.out.println("Marks is: "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Student s1=new Student();
		s1.roll=123;
		s1.name="Ankush";
		s1.marks=98;
		s1.displayStudentDetails();
		s1=null;
		
		dis();
		
		Student s2=new Student();
		s2.roll=987;
		s2.name="Subo";
		s2.marks=91;
		s2.displayStudentDetails();
		s2=null;
		

	}

}
