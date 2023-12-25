package org.december6;

public class ThreadFunctionsTest {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		Thread thread1 = new Thread(myThread);
		thread1.setName("thread-1");
		
		Thread thread2 = new Thread(myThread);
		thread2.setName("thread-2");
		
		Thread thread3 = new Thread(myThread);
		thread3.setName("thread-3");
		
		thread1.setPriority(4);
//		thread2.setPriority(9);
		thread3.setPriority(4);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
//		thread1.yield();
		
		try {
//			thread2.join();
			thread2.join(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
