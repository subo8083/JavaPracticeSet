package com.question3;

public abstract class Evaluation {

	private final int numberOfQuestions;
	abstract void evaluationTiming();
	
	
	public Evaluation(int n)
	{
		this.numberOfQuestions=n;
	} 
	
	void printNoOfQuestions() {
		System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
		}
	
	
}
