package org.december4;

import org.junit.Test;

public class TestClass {

//	@Test
//	public void primitivesTest() {
//		Primitives primitives = new Primitives();
//		primitives.createSet();
//		System.out.println();
//	}
//	
	@Test
	public void employeesTest() {
		EmployeeSet employeeSet = new EmployeeSet();
		employeeSet.createEmpSet1();
		System.out.println();
		
		employeeSet.createEmpSet2();
		System.out.println();
	}
//	
//	@Test
//	public void listsTest() {
//		SubLists subLists = new SubLists();
//		subLists.method1();
//		System.out.println();
//		
//		subLists.method2();
//		System.out.println();
//	}
	
//	@Test
//	public void listAndSetTest() {
//		ListAndSet listAndSet = new ListAndSet();
////		listAndSet.list();
////		System.out.println();
////		
////		listAndSet.set();
////		System.out.println();
//		
//		listAndSet.subList();
//		System.out.println();
//		
//	}

}
