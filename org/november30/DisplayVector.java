package org.november30;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DisplayVector {
	
	public Vector<Student> createVector(){
		
		Vector<Student> students = new Vector<Student>();
		
		students.add(new Student("A" , 1));
		students.add(new Student("B" , 2));
		students.add(new Student("C" , 3));
		students.add(new Student("D" , 4));
		students.add(new Student("E" , 5));
		
		return students;
		
	}
	
	public void displayUsingIterator(Vector<Student> students)
	{
		Iterator iterator = students.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
	
	public void displayUsingEnumeration(Vector<Student> students)
	{
		Enumeration<Student> student = students.elements();
		
		while (student.hasMoreElements()) {
			System.out.println(student.nextElement());
			
		}
		
	}
	
	

}
