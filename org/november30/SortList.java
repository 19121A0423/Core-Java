package org.november30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	
	public void sortList() {
		
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student("Raji", 22));
		studentsList.add(new Student("Geetha", 63));
		studentsList.add(new Student("Lakshmi", 13));
		
		System.out.println("Before sorting : "+studentsList);
		System.out.println();
		
		Collections.sort(studentsList);
		System.out.println("After sorting : "+studentsList);
		System.out.println();
		
		Collections.sort(studentsList,new ComparatorName());
		System.out.println("After sorting : "+studentsList);
		System.out.println();
		
		Collections.sort(studentsList,new ComparatorRollNo());
		System.out.println("After sorting : "+studentsList);
		System.out.println();
		
	}

}
