package org.november10;

public class SquareBoard {

	public static void main(String[] args) {
		int size=5;
		for(int index1=1;index1<=size;index1++) {
			for (int index2=1;index2<=size;index2++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

}
