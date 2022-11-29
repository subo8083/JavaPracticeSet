package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masai.shapes.AppRunner;
import com.masai.shapes.Circle;
import com.masai.shapes.Rectangle;
import com.masai.shapes.Square;

@SpringBootApplication
public class SpringEvalRevisionQues11Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringEvalRevisionQues11Application.class, args);
		
//		Circle c=new Circle();
//		AppRunner app=new AppRunner(c);
//		app.run();
		
		
		Rectangle rec=new Rectangle();
		AppRunner app2=new AppRunner(rec);
		app2.run();
		
//		Square sq=new Square();
//		AppRunner app3=new AppRunner(sq);
//		app3.run();
		
	}

}
