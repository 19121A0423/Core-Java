package org.november9;

public class LogicalAndBitwiseAnd {

	public void logicalAnd(int value) {
		boolean result= (value>100) && (value<500);
		System.out.println("Logical AND : "+result);
	}
	
	public void bitwiseAnd(int value1,int value2) {
		int result= value1 & value2;
		boolean result1= true & true ;
		System.out.println("Bitwise AND : "+result);
		System.out.println(result1);
	}
	
	public static void main(String[] args) {
		LogicalAndBitwiseAnd logicalAndBitwiseAnd = new LogicalAndBitwiseAnd();
		
		logicalAndBitwiseAnd.logicalAnd(869);
		logicalAndBitwiseAnd.bitwiseAnd(7,1);
		
	}

}
