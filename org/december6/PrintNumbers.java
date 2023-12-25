package org.december6;

public class PrintNumbers extends Thread {

	public PrintNumbers() {

	}

	public PrintNumbers(String name) {
		super(name);
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " started");
		for (int index = 1; index <= 30; index++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(index + " - " + Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getName() + " dead");

	}

}
