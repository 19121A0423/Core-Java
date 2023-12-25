package org.november;

public class SquareHollowPattern {

	public static void main(String[] args) {
		int size=5;
		for(int index1=0;index1<size;index1++) {
			for(int index2=0;index2<size;index2++) {
				if(index1==0 || index2==0 || index1==size-1 || index2==size-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
