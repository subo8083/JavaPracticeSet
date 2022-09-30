package evaluation2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the Students you want to enter:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter roll number: ");
			int rol=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Name: ");
			String name=sc.next();
			System.out.println("Enter marks: ");
			int marks=sc.nextInt();
			sc.nextLine();
			
			
			Student s1=new Student(rol,name,marks);
			System.out.println("Student details "+rol);
			System.out.println("Student roll number is: "+s1.getrollNumber());
			System.out.println("Stuident name is: "+s1.getName());
			System.out.println("Student mark: "+s1.getMarks());
			System.out.println("===========================================");
		}
		
		
		
	}

}
