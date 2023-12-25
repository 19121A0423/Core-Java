package org.november20;

import org.junit.Test;

public class TestClass {
	
	ImplementingExceptions implementingExceptions = new ImplementingExceptions();
	
	@Test
	public void program1Test() {
		
		System.out.println("Method started");
		try {
			implementingExceptions.program1();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Program1 exception handled");
		}
		
		System.out.println("Method ended");
		System.out.println();
	}
	
	@Test
	public void passwordTest() {
		System.out.println("Method started");
		implementingExceptions.checkingPassword("abd");
		System.out.println("Method ended");
		System.out.println();
		
	}
	
	@Test
	public void balanceTest() {
		System.out.println("Method started");
		try {
			implementingExceptions.checkingBalance(1082);
		} catch (MinimumBalance e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Method ended");
		System.out.println();
	}
	
	@Test
	public void withdrawATMTest() {
		System.out.println("Method started");
		implementingExceptions.withdrawATM(100,123);
		System.out.println("Method ended");
		System.out.println();
	}
	
	@Test
	public void calculateMethodTest() {
		System.out.println("Method started");
		implementingExceptions.calculateMethod();
		System.out.println("Method ended");
		System.out.println();
	}
	
	@Test
	public void withdrawBankTest() {
		System.out.println("Method started");
		implementingExceptions.withdrawBank(500);
		System.out.println("Method ended");
		System.out.println();
	}
	
	@Test
	public void eligibleForVoteOrNotTest() {
		System.out.println("Method started");
		try {
			implementingExceptions.eligibleForVoteOrNot(23,true);
		} catch (NotEligible e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Method ended");
		System.out.println();
	}
	
	
}
