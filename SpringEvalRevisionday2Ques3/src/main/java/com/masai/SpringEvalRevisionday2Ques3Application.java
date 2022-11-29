package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.masai.shapes.AppRunner;

@SpringBootApplication
public class SpringEvalRevisionday2Ques3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringEvalRevisionday2Ques3Application.class, args);
		
		AppRunner runn= context.getBean(AppRunner.class);
		runn.run();
	}

}
