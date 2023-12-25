package org.november10;

public class ThirdTableWithoutEven {
	
	public void printThirdTable1(int endValue) {
		for(int index=1;index<=endValue;index++) {
			int result=3*index;
			if(result%2==0) {
				continue;
			}
			System.out.print(result + ",");
		}
	}
	
	public void printThirdTable2(int endValue) {
		int index=1;
		while(index<=endValue) {
			int result=3*index;
			index++;
			if(result%2==0) {
				continue;
			}
			System.out.print(result + ",");
		}
	}
	
	public void printThirdTable3(int endValue) {
		int index=1;
		do {
			int result=3*index;
			index++;
			if(result%2==0) {
				continue;
			}
			System.out.print(result + ",");
		}
		while(index<=endValue);
	}
	
	public static void main(String[] args) {
		ThirdTableWithoutEven thirdTableWithoutEven = new ThirdTableWithoutEven();
		
		thirdTableWithoutEven.printThirdTable1(20);
		System.out.println();
		thirdTableWithoutEven.printThirdTable2(20);
		System.out.println();
		thirdTableWithoutEven.printThirdTable3(20);
	}

}
