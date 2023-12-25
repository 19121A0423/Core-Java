package org.november8;

public class IntArray {

	public static void main(String[] args) {
		int[] intArray = new int[5];	//array declaration and instantiation
		
		// array initialization
		intArray[0]=37;
		intArray[1]=638;
		intArray[2]=529;
		intArray[3]=925;
		intArray[4]=428;
		
		//printing array elements
		for(int index=0;index<intArray.length;index++) {
			System.out.println(intArray[index]);
		}
		System.out.println("---------------------------------");
		
		int[] intArray1= {24,627,437,528,234};	//array declaration and initialization
		
		//re-initialization of array elements
		intArray1[0]=925;
		intArray1[4]=6286;
		//intArray[5]=529;	// ArrayIndexOutOfBoundException
		
		//printing array elements
		for(int index=0;index<intArray.length;index++) {
			System.out.println(intArray[index]);
		}
	}
	

}
