package org.december11;

import java.util.function.Predicate;

public class CheckPalindrome {
	
	public static Boolean stringReverse(String string) {
		String reverseString="";
		for(int index=0;index<string.length();index++) {
			reverseString = string.charAt(index)+reverseString;
		}
//		System.out.println(reverseString);
		return reverseString.equals(string);
	}
	
	public static void main(String[] args) {
		
		Predicate<String> predicate = (string) -> {
			String reverseString="";
			for(int index=0;index<string.length();index++) {
				reverseString = reverseString+string.charAt(index);
			}
			return reverseString.equals(string);
		};
		
		System.out.println(predicate.test("madam"));
		
		
		Predicate<String> predicate2= CheckPalindrome::stringReverse;
		System.out.println(predicate2.test("maamkj"));
		
	}

}
