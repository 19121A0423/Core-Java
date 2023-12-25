package org.november27;

import org.junit.Test;

public class TestClass {
	
	@Test
	public void testMethod() {
		WrapperClass wrapperObj = new WrapperClass();
		
		wrapperObj.stringToPrimitive();
		System.out.println();
		
		wrapperObj.checkIntegerOrNot();
		System.out.println();
		
		wrapperObj.wrapperMethods();
		System.out.println();
		
		wrapperObj.boxing();
		System.out.println();
		
		wrapperObj.unBoxing();
		System.out.println();
		
		
	}

}
