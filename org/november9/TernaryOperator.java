package org.november9;

public class TernaryOperator {
	
	public void checkGreaterOrLesserTernary(int value1,int value2) {
		System.out.println(value1>value2?value1+ " is greater than "+value2:value1 +" is lesser than "+value2);
	}
	
	public void CheckEvenOrOddUsingTernary(int value) {
		System.out.println(value%2==0? value+" is even": value+" is odd");
	}
	
	public void CheckPositiveOrNegativeUsingTernary(int value) {
		System.out.println(value>=0? value+" is positive":value+" is negative");
	}
	
	public static void main(String[] args) {
		
		TernaryOperator ternaryOperator = new TernaryOperator();
		
		ternaryOperator.checkGreaterOrLesserTernary(637,428);
		ternaryOperator.CheckEvenOrOddUsingTernary(5372);
		ternaryOperator.CheckPositiveOrNegativeUsingTernary(-538);
		
	}

}
