package org.december6;

public class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		for (int index = 1; index <= 10; index++) {
			System.out.println( "Hello - " + Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getName() + " dead");

	}

}
