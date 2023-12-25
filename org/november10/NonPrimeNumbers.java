package org.november10;

public class NonPrimeNumbers {
	
	public boolean checkIsPrime1(int value) {
		if(value<=1) {
			return false;
		}
		for(int index=2;index<=value/2;index++) {
			if(value%index==0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean checkIsPrime2(int value) {
		if(value<=1) {
			return false;
		}
		int index=2;
		while(index<=value/2) {
			if(value%index==0) {
				return false;
			}
			index++;
		}
		return true;
	}
	
	public boolean checkIsPrime3(int value) {
		if(value<=1) {
			return false;
		}
		int index=2;
		do {
			if(value%index==0 && value!=2) {
				return false;
			}
			index++;
		}
		while(index<=value/2);
		return true;
	}
	
	public void printNonPrimeNumbers1() {
		for(int index=1;index<=100;index++) {
			if(checkIsPrime1(index)==false) {
				System.out.print(index+" , ");
			}
		}
	}
	
	public void printNonPrimeNumbers2() {
		int index=1;
		while(index<=100) {
			if(checkIsPrime2(index)==false) {
				System.out.print(index+" , ");
			}
			index++;
		}
	}
	
	public void printNonPrimeNumbers3() {
		int index=1;
		do {
			if(checkIsPrime3(index)==false) {
				System.out.print(index+" , ");
			}
			index++;
		}
		while(index<=100);
	}
	
	public static void main(String[] args) {
		NonPrimeNumbers nonPrimeNumbers=new NonPrimeNumbers();
		
		nonPrimeNumbers.printNonPrimeNumbers1();
		System.out.println();
		nonPrimeNumbers.printNonPrimeNumbers2();
		System.out.println();
		nonPrimeNumbers.printNonPrimeNumbers3();
		
	}

}
