package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masai.shapes.AppRunner;
import com.masai.shapes.Calculators;
import com.masai.shapes.ShapeAreaCalculator;

@SpringBootApplication
public class SpringEvalRevisionday2Ques2And3Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringEvalRevisionday2Ques2And3Application.class, args);
		
		ShapeAreaCalculator sh=new Calculators();
		
		AppRunner app=new AppRunner(sh);
		
		app.run();
		
		
	}

}
