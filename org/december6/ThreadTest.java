package org.december6;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " started");
		 
		
		// Creating thread using Runnable Interface
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		thread.setName("MyThread");
		
		for(int index=0;index<10;index++) {
			System.out.println("Hai - " + Thread.currentThread().getName());
		}
		
		System.out.println(Thread.currentThread().getName() + " dead");
		
	}

}
