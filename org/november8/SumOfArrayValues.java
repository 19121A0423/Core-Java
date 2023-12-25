package org.november8;

public class SumOfArrayValues {

	public int arrayElementsSum(int[] intArray) {
		int sum=0;
		sum=intArray[0]+intArray[1]+intArray[2]+intArray[3];
		return sum;
	}
	
	public static void main(String[] args) {
		int []intArray= {376,8392,5936,9253};
		
		SumOfArrayValues sumOfArrayValues=new SumOfArrayValues();
		
		int sumOfElements=sumOfArrayValues.arrayElementsSum(intArray);
		System.out.println(sumOfElements);
	}

}
