package org.november30;

import java.util.List;

public class ListToArray {

	public void arraylistToarray(List<Student> studentList) {
		
		Object[] students1 = studentList.toArray();		// return type of toArray method is Object
		
		for(int index=0;index<students1.length;index++) {
			System.out.println(students1[index]);
		}
		
		Student[] students2 = new Student[studentList.size()];
		
		for(int index=0;index<students2.length;index++) {
			students2[index] = studentList.get(index);	// here return type of get method is Student 
		}
		
		System.out.println();
		for(Student student : students2) {
			System.out.println(student);
		}
		
	}
	
}
