package org.november10;

public class TimeTable {

	public static void main(String[] args) {
		System.out.println("* | 1 2 3 4 5 6 7 8 9");
		System.out.println("---------------------");
		
		for(int index1=1;index1<=9;index1++) {
			System.out.print(index1+" | ");
			for(int index2=1;index2<=9;index2++) {
				System.out.print(index1*index2+" ");
			}
			System.out.println();
		}
	}

}
