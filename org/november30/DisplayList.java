package org.november30;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DisplayList {

	public void displayUsingFor(List<Student> students) {

		System.out.println("Displaying students using normal for loop");
		for (int index = 0; index < students.size(); index++) {
			System.out.println(students.get(index));
		}
		System.out.println();

		System.out.println("Displaying students using enhanced for loop");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();

	}

	public void displayUsingIterator(List<Student> students) {

		Iterator iterator = students.iterator();

		System.out.println("Displaying students using Iterator");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();

	}

	public void displayUsingListIterator(List<Student> students) {

		ListIterator iterator = students.listIterator();

		System.out.println("Displaying students using ListIterator in forward direction");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		
		ListIterator iterator1 = students.listIterator(students.size());
		System.out.println("Displaying students using ListIterator in backward direction");
		while (iterator1.hasPrevious()) {
			System.out.println(iterator1.previous());
		}
		System.out.println();

	}
}
