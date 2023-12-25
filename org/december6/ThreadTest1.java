package org.december6;

public class ThreadTest1 {
	
	public static void main(String[] args) {
		
		PrintEvenOrOdd print = new PrintEvenOrOdd();
		
		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				print.printEven();   //synchronized function
			}
		};
		
		Runnable runnable2 = new Runnable() {
			@Override
			public void run() {
				print.printOdd();	// non-synchronized function
			}
		};
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable1);
		Thread thread3 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
