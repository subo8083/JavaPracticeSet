package com.masai.shapes;

public class Calculators implements ShapeAreaCalculator, ShapeDrawer{


	@Override
	public void areaOfCircle(int n) {
		System.out.println("Area of circle= "+n*n*3.14);
		
	}

	@Override
	public void areaOfRectangle(int l, int b) {
		System.out.println("Area of rectangle is= "+l*b);
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing");
		
	}
	
	
	

}
