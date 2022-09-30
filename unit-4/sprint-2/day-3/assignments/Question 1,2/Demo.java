package assignment6;

public class Demo {

	Demo()
	{
		this("hello");
		System.out.println("inside Demo()...");
	}
	Demo(String s)
	{
		this(10);
		System.out.println("Inside Demo(String s)");
	}
	Demo(int i)
	{
		this(8.4f);
		System.out.println("Inside Demo(int i)");
	}
	Demo(float f)
	{
		System.out.println("Inside Demo(float f)");
	}
	
	public static void main(String[] args)
	{
		Demo d1=new Demo();
	}
}
