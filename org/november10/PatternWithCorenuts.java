package org.november10;

public class PatternWithCorenuts {

	public static void main(String[] args) {
		String string="corenuts";
		
		for(int index1=0;index1<string.length();index1++) {
			for(int index2=0;index2<=index1;index2++) {
				System.out.print(string.charAt(index2));
			}
			System.out.println();
		}
	}

}
