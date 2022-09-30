package evaluation2;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private int marks;
	
	
	Student()
	{
		
	}
	Student(int rollNumber,String studentName,int marks)
	{
		this.rollNumber=rollNumber;
		this.studentName=studentName;
		this.marks=marks;
	}
	
	public void setrollNumber(int rollNumber){
		this.rollNumber=rollNumber;
	}
	public int getrollNumber() {
		return rollNumber;
	}
	
	
	public void setName(String studentName) {
		this.studentName=studentName;
	}
	public String getName()
	{
		return studentName;
	}
	
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks()
	{
		return marks;
	}

	
	
}
