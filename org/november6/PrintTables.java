package org.november6;

import java.util.Scanner;

public class PrintTables {
	//method print the tables based on parameters and index
	static void printTables(int value,int tableupto) {
		for(int index=1;index<=tableupto;index++) {
			System.out.println(value+"x"+index+"="+value*index);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print tables upto");
		int tables=sc.nextInt();
		System.out.println("Enter a number to print every table upto");
		int tablesupto=sc.nextInt();
		for(int index=1;index<=tables;index++) {
			System.out.println("-----------Table:"+index+"------------");
			printTables(index,tablesupto);
			System.out.println();
		}
	}
}
