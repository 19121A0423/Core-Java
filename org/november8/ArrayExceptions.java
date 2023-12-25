package org.november8;

public class ArrayExceptions {

	public static void main(String[] args) {
		
		char[] characters=new char[-3];		//NegativeArraySizeException
		
		characters[0]='h';
		characters[1]='d';
		characters[2]='s';
		System.out.println(characters[0]);
		System.out.println(characters[1]);
		System.out.println(characters[2]);
		
		double []doubleArray = new double[3];
		doubleArray[0]=5328.73;
		doubleArray[1]=638628.629;
		doubleArray[2]=52863962.6;
		doubleArray[3]=5398766.538;		//ArrayIndexOutOfBoundsException
		
		System.out.println(doubleArray[6]);		//ArrayIndexOutOfBoundsException
		
	}

}
