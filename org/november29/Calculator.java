package org.november29;

public class Calculator {

	Double element1;
	Double element2;

	public <T> void sumElements(T value1, T value2) {

		if (isNumbers(value1, value2)) {
			System.out.println("parameters are numbers ");
//			Double result1 = Double.sum(element1,element2) ;
			double result = element1 + element2 ;
			System.out.println("Addition Result : " + result);
		} else {
			System.out.println("parameters are not numbers");
			String result = value1+""+value2+"";
			System.out.println("String conacatenation : "+result);
		}

	}

	public <T> void differenceElements(T value1, T value2) {

		if (isNumbers(value1, value2)) {
			System.out.println("parameters are numbers ");
			double result = element1 - element2 ;
			System.out.println("Difference Result : " + result);
		} else {
			System.out.println("parameters are not numbers");
			
		}

	}

	public <T> boolean isNumbers(T value1, T value2) {
		try {
//			String temp1 = value1+""; 
//			String temp2 = value2+"";
			element1 = Double.parseDouble(value1 + "");
			element2 = Double.parseDouble(value2 + "");
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
