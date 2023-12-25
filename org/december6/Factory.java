package org.december6;

public class Factory {
	
	int noOfProducts = 10;
	
	public synchronized void consume(int products) {
		
		System.out.println("Trying to consume products");
		if(noOfProducts < products) {
			try {
				System.out.println("Waiting for  producing products");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		noOfProducts -=products;
		System.out.println(products +" are consumed successfully");
		System.out.println(noOfProducts+" products are available");
		
	}
	
	public synchronized void produce(int products) {
		System.out.println("Producing products");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		noOfProducts+=products;
		System.out.println(products + " are produced successfully");
		notify();
	}

}
