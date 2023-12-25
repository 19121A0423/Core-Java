package org.november23;

public class Demo {

	public void demo() {
		System.out.println("demo1");
		return;
//		System.out.println("demo1");
	}
	
	public static void main(String[] args) {
		try {
			int i=99;
			int i1=0;
			System.out.println(i/i1);
			
		}
		catch(ArithmeticException e) {
			System.out.println("catch");
			return;
		}
		finally {
			System.out.println("finally");
		}
	}

}
