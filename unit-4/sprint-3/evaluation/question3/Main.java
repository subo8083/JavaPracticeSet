package com.question3;

public class Main {
	
	public Evaluation messageToStudents(Evaluation ev)
	{
		
//		Evaluation e1=new DsaEvaluation(5);
//		Evaluation e2=new CodingEvaluation();
		if(ev instanceof DsaEvaluation)
		{
			System.out.println("This is Dsa Evaluation");
			DsaEvaluation d1=(DsaEvaluation)ev;
			d1.printNoOfQuestions();
			
			d1.evaluationTiming();
			
			return d1;
		}
		else if(ev instanceof CodingEvaluation)
		{
			System.out.println("This is Coding Evaluation");
			CodingEvaluation c1=(CodingEvaluation)ev;
			c1.printNoOfQuestions();
			
			c1.evaluationTiming();
			return c1;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Main m1=new Main();
		m1.messageToStudents(new DsaEvaluation(5));
		System.out.println("============================================");
		m1.messageToStudents(new CodingEvaluation(4));
		
		

	}

}
