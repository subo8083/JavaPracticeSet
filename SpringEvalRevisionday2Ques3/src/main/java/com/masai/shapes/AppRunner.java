package com.masai.shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AppRunner {
	
//	@Autowired
	private ShapeAreaCalculator sh;

	
	@Autowired
	public AppRunner(ShapeAreaCalculator sh) {
		// TODO Auto-generated constructor stub
		this.sh=sh;
	}
	
	public void run() {
		sh.areaOfCircle(9);
		sh.areaOfRectangle(3, 4);
		
	}
	
	

}
