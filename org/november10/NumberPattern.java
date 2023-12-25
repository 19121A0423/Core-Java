package org.november10;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter size for number pattern");
		int size=scanner.nextInt();
		for(int index1=1;index1<=size;index1++) {
			for (int index2=1;index2<=index1;index2++) {
				System.out.print(index2+" ");
			}
			System.out.println();
		}
	}

}
