package org.november30;

import java.util.Objects;
import java.util.Random;

public class Student  implements Comparable<Student>   {

	String name;
	int rollno;

	public Student(String name, int rollno) {

		this.name = name;
		this.rollno = rollno;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student  name=" + name + ", rollno=" + rollno;
	}

	@Override
	public boolean equals(Object obj) {
//		System.out.println("equals method");
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(name, other.name) && rollno == other.rollno;
		
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Hashcode method");
		
//		Random rand = new Random();
//		return rand.nextInt();
//		return Objects.hash(name, rollno);
		return 1;

	}

	@Override
	public int compareTo(Student stud) {
		return this.name.compareTo(stud.getName());
		
		
	}

}
