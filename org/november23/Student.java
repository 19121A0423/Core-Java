package org.november23;

public class Student{
	
	String name;
	
	public Student() {
		name="unknown";
	}
	
	public Student(String name) {
		this.name=name;
	}
		
	public void test() {
		try {
			throw new NullPointerException();
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException "+e.getMessage());
			
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException "+e.getMessage());
		}
		finally {
			return;
		}
		
	}
	
}
