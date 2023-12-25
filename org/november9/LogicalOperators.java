package org.november9;

public class LogicalOperators {

	public void logicalAnd(int value) {
		boolean result = (value > 100) && (value < 500);
		System.out.println("Logical AND : " + result);
	}

	public void logicalOr(int value) {
		boolean result = (value < 500) || (value > 1000);
		System.out.println("Logical OR : " + result);
	}

	public void logicalNot(int value) {
		boolean result = !(value < 600);
		System.out.println("Logical NOT : " + result);
	}

	public void logicalAndWithUnary(int value) {
		boolean result = (value > 100) && (value++ < 500);
		System.out.println(value);
	}

	public void logicalOrWithUnary(int value) {
		boolean result = (value < 500) || (value++ > 1000);
		System.out.println(value);
	}

	public static void main(String[] args) {
		LogicalOperators logicalOperators = new LogicalOperators();

		logicalOperators.logicalAnd(546);
		logicalOperators.logicalOr(486);
		logicalOperators.logicalNot(5938);
		logicalOperators.logicalAndWithUnary(548);
		logicalOperators.logicalOrWithUnary(54);

		int value1 = 10;
		int value2 = 20;
		int value3 = 30;
		if ((value1 > 20) && (value2++ > 10)) 
		{
			System.out.println(value2);
		}
		else {
			System.out.println(value2);
		}
		if ((value1 > 20) & (value3++ > 10)) {
			System.out.println(value3);
		}
		else {
			System.out.println(value3);
		}
	}

}
