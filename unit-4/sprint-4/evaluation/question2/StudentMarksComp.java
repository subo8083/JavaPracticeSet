package com.question2;

import java.util.Comparator;

public class StudentMarksComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		
		if(o1.getEngMarks()+o1.getMathMarks()+o1.getScienceMarks()>o2.getEngMarks()+o2.getMathMarks()+o2.getScienceMarks())
			return 1;
		else if(o1.getEngMarks()+o1.getMathMarks()+o1.getScienceMarks()<o2.getEngMarks()+o2.getMathMarks()+o2.getScienceMarks())
			return -1;
		else if(o1.getEngMarks()+o1.getMathMarks()+o1.getScienceMarks()==o2.getEngMarks()+o2.getMathMarks()+o2.getScienceMarks())
		{
			return o2.getName().compareTo(o1.getName());
		}
		else if(o1.getName().equals(o2.getName()))
		{
			if(o1.getRollNo()>o2.getRollNo())
				return -1;
			else if(o1.getRollNo()<o2.getRollNo())
				return 1;
			else
				return 0;
		}
		return 0;
	
	
	}
	
	

}
