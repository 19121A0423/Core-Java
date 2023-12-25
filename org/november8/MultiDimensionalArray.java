package org.november8;

public class MultiDimensionalArray {

	public void create2DArray(int[][] twoDimensionalArray) {
		
		twoDimensionalArray[0]=new int[1];
		twoDimensionalArray[1]=new int[3];
		twoDimensionalArray[2]=new int[2];
		
		twoDimensionalArray[0][0]=73;
		
		twoDimensionalArray[1][0]=12;
		twoDimensionalArray[1][1]=23;
		twoDimensionalArray[1][2]=92;
		
		twoDimensionalArray[2][0]=32;
		twoDimensionalArray[2][1]=42;		
		
	}
	public static void main(String[] args) {
		
		MultiDimensionalArray multiDimensionalArray=new MultiDimensionalArray();
		int[][] twoDimensionalArray=new int[3][];
		multiDimensionalArray.create2DArray(twoDimensionalArray);
		System.out.println(twoDimensionalArray[2][1]);
	}

}
