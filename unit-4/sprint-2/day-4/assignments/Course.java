package assignment7;
import java.util.Scanner;

public class Course {

	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails()
	{
		System.out.println("course ID is: "+courseId);
		System.out.println("courseName is: "+courseName);
		System.out.println("course Fee is: "+courseFee);
	}
	
	static void authenticate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username: ");
		String userNameInput=sc.nextLine();
		System.out.println("Enter Password: ");
		String userPasswordInput=sc.nextLine();
		
		if(userNameInput.equals("Admin") && userPasswordInput.equals("1234"))
		{
			
			Course c1=new Course();
			c1.courseId=111;
			c1.courseFee=1200;
			c1.courseName="IIT-JEE";
			c1.displayCourseDetails();
		}
		else
		{
			System.out.println("Invalid details");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course.authenticate();
		
		
	}

}
