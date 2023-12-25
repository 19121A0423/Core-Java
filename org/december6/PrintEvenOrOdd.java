package org.december6;

public class PrintEvenOrOdd {
	
	public synchronized void printEven() {
		for(int index=1;index<=20;index++) {
			if(index%2==0) {
				System.out.println(index+" - "+Thread.currentThread().getName());
			}
		}
	}
	
	public void printOdd() {
		for(int index=1;index<=20;index++) {
			if(index%2!=0) {
				System.out.println(index+" - "+Thread.currentThread().getName());
			}
		}
	}

}
