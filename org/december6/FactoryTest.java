package org.december6;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		Factory factory = new Factory();
		
		Runnable runnable1=() -> {
			factory.consume(15);
		};
		
		Runnable runnable2=() ->{
			factory.produce(10);
		};
		
		Thread thread1=new Thread(runnable1);
		Thread thread2=new Thread(runnable2);
		
		thread1.start();
		thread2.start();
		
	}

}
