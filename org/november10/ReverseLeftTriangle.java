package org.november10;

import java.util.Scanner;

public class ReverseLeftTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter size");
		int size=scanner.nextInt();
		for(int index1=0;index1<size;index1++) {
			for(int index2=0;index2<size-index1;index2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
