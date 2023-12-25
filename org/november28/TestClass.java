package org.november28;

import org.junit.Test;

public class TestClass {
	
//	@Test
//	public void genericTest() {
//		Generics obj = new Generics();
//		
//		obj.program1();
//		System.out.println();
//		
//	}
//	
//	@Test
//	public void calTest() {
//		Person<String,Long> obj = new Person<String,Long>();
//		
//		obj.<String>setName("Raji");
//		obj.<Long>setPhoneno(9390145041l);
//		System.out.println(obj.getName());
//		System.out.println(obj.getPhoneno());
//		System.out.println();
//		
//	}
	
	@Test
	public void operationsTest() {
		Operations obj = new Operations();
		
		obj.<Integer>display(8769,8765);
		System.out.println();
		
		obj.list();
		System.out.println();
		
	}
	
}
