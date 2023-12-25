package org.november14;

public class SelectionSort {
	
	public void selectionSortMethod(int []array) {
		for(int index1=0;index1<array.length;index1++) {
			int minValue=index1;
			for(int index2=index1+1;index2<array.length;index2++) {
				if(array[index2]<array[minValue]) {
					minValue=index2;
				}
			}
			if(minValue!=index1) {
				int temp=array[minValue];
				array[minValue]=array[index1];
				array[index1]=temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {5,2,9,1,6};
		
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectionSortMethod(array);
		for(int index=0;index<array.length;index++) {
			System.out.print(array[index]+" ");
		}
	}

}
