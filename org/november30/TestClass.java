package org.november30;

import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestClass {
	
	@Test
	public void arrayToListTest() {
		
		System.out.println("method started");
		Student[] students = new Student[3];
		students[0] = new Student("Raji", 1);
		students[1] = new Student("Geetha", 2);
		students[2] = new Student("Lakshmi", 3);
		
		ArraysToList arrayToList = new ArraysToList();
		
		arrayToList.arrayToArrayList(students);
		arrayToList.arrayToLinkedList(students);
		arrayToList.arrayToVector(students);
		
		System.out.println("method ended");
		System.out.println();
		
	}
	
	@Test
	public void listToArrayTest() {
		
		System.out.println("method started");
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student("Raji", 1));
		studentsList.add(new Student("Geetha", 2));
		studentsList.add(new Student("Lakshmi", 3));
		
		ListToArray listToArray = new ListToArray();
		
		listToArray.arraylistToarray(studentsList);
		
		System.out.println("method ended");
		System.out.println();
		
	}
	
	@Test
	public void displayListTest() {
		
		System.out.println("method started");
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student("Raji", 1));
		studentsList.add(new Student("Geetha", 2));
		studentsList.add(new Student("Lakshmi", 3));
		
		DisplayList displayList = new DisplayList();
		
		displayList.displayUsingFor(studentsList);
		displayList.displayUsingIterator(studentsList);
		displayList.displayUsingListIterator(studentsList);
		
		System.out.println("method ended");
		System.out.println();
		
	}
	
	@Test
	public void primitivesTest() {
		
		ArrayListWithPrimitives arrayListWithPrimitives = new ArrayListWithPrimitives();
		
		List primitives = arrayListWithPrimitives.createArrayList();
		arrayListWithPrimitives.displayUsingFor(primitives);
		arrayListWithPrimitives.displayUsingIterator(primitives);
		System.out.println();
		
	}
	
	@Test
	public void vectorTest() {
		
		DisplayVector displayVector = new DisplayVector();
		
		Vector students = displayVector.createVector();
//		displayVector.displayUsingEnum(primitives);
		displayVector.displayUsingIterator(students);
		System.out.println();
		
	}
	
	@Test
	public void sortList() {
		
		SortList sortListobj = new SortList();
		
		sortListobj.sortList();
		
	}
	

}
