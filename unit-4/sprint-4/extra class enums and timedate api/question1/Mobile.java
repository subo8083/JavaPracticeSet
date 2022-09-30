package com.question1;

public class Mobile {
	
	static String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String...str) {
		
		for(String s:str) {
			
			if(s.equals(outdatedModels[0])) {
				System.out.println("note4_OUTDATED");
			}
			else if(s.equals(outdatedModels[1])) {
				System.out.println("note5_OUTDATED");
			}
			else if(s.equals(outdatedModels[2])) {
				System.out.println("note6_OUTDATED");
			}
			else if(s.equals(outdatedModels[3])) {
				System.out.println("note7_OUTDATED");
			}
			else
			{
				System.out.println(s+" Not OUTDATED");
			}
			
			
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		Mobile m1=new Mobile();
		String[] st= {"note4","ipad"};
		m1.searchOutdatedModel(st);
		
		
	}

}
