package org.november30;

import java.util.Comparator;

public class ComparatorRollNo implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getRollno() > s2.getRollno()) {
			return 1;
		}
		
		else if(s1.getRollno() < s2.getRollno()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
