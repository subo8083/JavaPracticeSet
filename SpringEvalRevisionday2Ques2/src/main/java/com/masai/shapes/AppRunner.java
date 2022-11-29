package com.masai.shapes;

public class AppRunner {
	
	
	private ShapeAreaCalculator sh;

	public AppRunner(ShapeAreaCalculator sh) {
		// TODO Auto-generated constructor stub
		this.sh=sh;
	}
	
	public void run() {
		sh.areaOfCircle(9);
		sh.areaOfRectangle(3, 4);
		
	}
	
	

}
