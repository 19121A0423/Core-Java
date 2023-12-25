package org.november6;

import java.util.Scanner;

public class CountCharacters {
	static void countCharacters(String name,char character) {
		int count=0;
		for(int index=0;index<name.length()-1;index++) {
			if(name.charAt(index)==character) {
				count++;
			}	
		}
		System.out.println("Count of "+character+" = "+count);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scanner.nextLine();
		System.out.println("Enter character to count");
		char character=scanner.next().charAt(0);
		countCharacters(name,character);
		scanner.close();
	}
}
