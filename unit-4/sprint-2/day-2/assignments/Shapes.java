package assignment5;

public class Shapes {
	
	public void area(Circle circle)
	{
		circle.radius=3;
		System.out.println(circle.radius*circle.radius*3.14);
	}
	public void area(Rectangle rectangle)
	{
		rectangle.length=2;
		rectangle.breadth=6;
		System.out.println(rectangle.length*rectangle.breadth);
	}
	public void area(Square square)
	{
		square.side=8;
		System.out.println(square.side*square.side);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes s1=new Shapes();
		s1.area(new Circle());
		s1.area(new Rectangle());
		s1.area(new Square());		
		
		
	}

}
