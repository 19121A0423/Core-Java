package org.november10;

import java.util.Scanner;

public class FindMaxAndMinFromArray {
	
	public void findMaxValue(int[] array) {
		int maxValue=array[0];
		for(int index=0;index<array.length;index++) {
			if(maxValue<array[index]) {
				maxValue=array[index];
			}
		}
		System.out.println("Maximum Value : "+maxValue);
	}
	
	public void findMinValue(int[] array) {
		int minValue=array[0];
		for(int index=0;index<array.length;index++) {
			if(minValue>array[index]) {
				minValue=array[index];
			}
		}
		System.out.println("Minimum Value : "+minValue);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		FindMaxAndMinFromArray findMaxAndMinFromArray=new FindMaxAndMinFromArray();
		
		System.out.println("enter array size:");
		int size=scanner.nextInt();
		System.out.println("enter array elements");
		int []array=new int[size];
		for(int index=0;index<array.length;index++) {
			array[index]=scanner.nextInt();
		}
		
		findMaxAndMinFromArray.findMaxValue(array);
		findMaxAndMinFromArray.findMinValue(array);
	}

}
