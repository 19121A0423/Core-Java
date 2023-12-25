package org.november20;

import java.io.FileInputStream;

public class ImplementingExceptions implements Exceptions{

	@Override
	public void program1() throws Exception {
		
		FileInputStream fileInputStream = new FileInputStream("file.txt");
		
		throw new Exception("Exception raised");

	}
	
	@Override
	//2 program
	public void checkingPassword(String epassword) {
		
		String cpassword="abcd";
		try {
			if(cpassword.equals(epassword)) {
				System.out.println("Password is Matching");
			}
			else {
				throw new PasswordNotMatching("Password is not Matching. Once Check your Password");
			}
		}
		catch(PasswordNotMatching e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Method ended");
	}

	@Override
	// 3 program
	public void checkingBalance(int balance) throws MinimumBalance {
		
		System.out.println("Method started");
		try {
			int numerator=38;
			int denominator=0;
			System.out.println(numerator/denominator);
		}
		catch(ArithmeticException e){
			if(balance>1000) {;
				System.out.println("Your are having minimum balance");
			}
			else {
				throw new MinimumBalance("Your balance is lessthan 1000. Please maintian minimum balance");
			}
		}
		
		System.out.println("Method ended");
	}

	@Override
	//program4
	public void withdrawATM(int amount,int epin) {
		System.out.println("Method started");
		
		int balance=1000;
		int cpin=1234;
		
		try {
			if(epin==cpin) {
				try {
					if(balance>amount) {
						System.out.println("Amount is withdrawed");
					}
					else {
						throw new InsufficientBalance("Your balance is lessthan amount. It is not possible to withdraw");
					}
				}
				catch(InsufficientBalance e) {
					System.out.println(e.getMessage());
				}
			}
			else {
				throw new PinNotMatching("Pin is incorrect. Please enter correct pin");
			}
		}	
		catch(PinNotMatching e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	@Override
	public void calculateMethod() {
		try {
			calculate(new int[] {});
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void calculate(int[] array) throws ArrayIndexOutOfBoundsException{
		try {
			System.out.println(array[array.length]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("We cant access the array element out of length");
		}
	}

	@Override
	public void withdrawBank(int amount) {
		withdraw(amount);
	}
	
	public void withdraw(int amount) {
		int balance=1000;
		try {
			if(balance>amount) {
				System.out.println("Amount is successfully withdrawed");
			}
			else {
				throw new InsufficientBalance("Balance is lessthan amount. It is not possible to withdraw");
			}
		}
		catch(InsufficientBalance e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void eligibleForVoteOrNot(int age, boolean voterId) throws NotEligible {
		if(age>=18 && voterId==true) {
			System.out.println("Eligible for voting");
		}
		else {
			throw new NotEligible("Your are not eligible foe voting");
		}
	}
	
	

}
