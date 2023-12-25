package org.november9;

public class ArithmeticOperators {
	
	public void addition(int value1,int value2) {
		int result=value1+value2;
		System.out.println("Addition Result: "+result);
	}
	
	public void subtraction(int value1,int value2) {
		int result=value1-value2;
		System.out.println("Subtraction Result: "+result);
	}
	
	public void multiplication(int value1,int value2) {
		int result=value1*value2;
		System.out.println("Multiplication Result: "+result);
	}
	
	public void division(int value1,int value2) {
		int result=value1/value2;
		System.out.println("Division Result: "+result);
	}
	
	public void modulus(int value1,int value2) {
		int result = value1%value2;
		System.out.println("Modulus Result: "+result);
	}
	
	public static void main(String[] args) {
		ArithmeticOperators arithmeticOperators=new ArithmeticOperators();
		
		arithmeticOperators.addition(1265,5282);
		arithmeticOperators.subtraction(6386,2546);
		arithmeticOperators.multiplication(50,35);
		arithmeticOperators.division(2000,20);
		arithmeticOperators.modulus(298,10);
		
		int value=6%2*8/4+3;
		System.out.println(value);
		
		int value1=9*2+41/10-8;
		System.out.println(value1);
		
		int value2=12*(56+44)-50/5;
		System.out.println(value2);
		
	}

}
