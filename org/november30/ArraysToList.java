package org.november30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArraysToList {

	//Array To ArrayList
	public void arrayToArrayList(Student[] students) {

		List<Student> studentsList = new ArrayList<Student>();

		for (Student student : students) {
			studentsList.add(student);
		}
		
		System.out.println(studentsList);

	}

	//Array To LinkedList
	public void arrayToLinkedList(Student[] students) {

		List<Student> studentsList = new LinkedList<Student>();

		for (Student student : students) {
			studentsList.add(student);
		}
		
		System.out.println(studentsList);

	}

	//Array To Vector
	public void arrayToVector(Student[] students) {

		List<Student> studentsList = new Vector<Student>();

		for (Student student : students) {
			studentsList.add(student);
		}
		
		System.out.println(studentsList);

	}

}
