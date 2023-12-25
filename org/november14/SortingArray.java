package org.november14;

public class SortingArray {
	
	public void ascendingOrder(int[] array) {
		for(int index1=0;index1<array.length;index1++) {
			for (int index2=index1+1;index2<array.length;index2++) {
				if(array[index1]>array[index2]) {
					int temp=array[index1];
					array[index1]=array[index2];
					array[index2]=temp;
				}
			}
		}
	}
	
	public void descendingOrder(int[] array) {
		for(int index1=0;index1<array.length;index1++) {
			for (int index2=index1+1;index2<array.length;index2++) {
				if(array[index1]<array[index2]) {
					int temp=array[index1];
					array[index1]=array[index2];
					array[index2]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		SortingArray sortingArray = new SortingArray();
		 int []array= {9,4,2,7,3,0,1};
		 for(int index=0;index<array.length;index++) {
			 System.out.print(array[index]+" ");
		 }
		 System.out.println();
		 sortingArray.ascendingOrder(array);
		 for(int index=0;index<array.length;index++) {
			 System.out.print(array[index]+" ");
		 }
		 System.out.println();
		 sortingArray.descendingOrder(array);
		 for(int index=0;index<array.length;index++) {
			 System.out.print(array[index]+" ");
		 }
		 System.out.println();
		 
	}

}
