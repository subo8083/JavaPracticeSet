package com.question2;

import java.util.Comparator;

public class StudentMarksComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getMarks()>o2.getMarks()?1:o1.getMarks()<o2.getMarks()?-1:0;
		
	}

}
