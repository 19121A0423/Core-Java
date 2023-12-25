package org.november14;

public class Palindrome {
	
	public int intReverse(int number) {
		int reverseNumber=0;
		while(number!=0) {
			reverseNumber=(reverseNumber*10)+number%10;
			number/=10;
		}
		return reverseNumber;
	}

	public String stringReverse(String string) {
		String reverseString="";
		for(int index=0;index<string.length();index++) {
			reverseString =string.charAt(index)+ reverseString;
		}
		return reverseString;
	}
	
	public static void main(String[] args) {
		Palindrome palindrome=new Palindrome();
		
		int number=57475;
		int intResult = palindrome.intReverse(number);
		if(number==intResult) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a Palindrome number");
		}
		
		String string="abcb";
		String stringResult=palindrome.stringReverse(string);
		
		System.out.println(string.equals(stringResult)?"Palindrome":"Not a palindrome");
		
		
	}

}
