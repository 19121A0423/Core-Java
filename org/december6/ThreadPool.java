package org.december6;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Runnable run1=() -> {
			System.out.println("Hello - "+Thread.currentThread().getName());
		};
		
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		for(int index=1;index<=8;index++) {
			threadPool.submit(run1); 	//return type Future<> obj
//			threadPool.execute(run1); //return type void 
		}
		
//		threadPool.shutdown();  //java.util.concurrent.RejectedExecutionException
		
		Callable<String> call=() -> {
//			System.out.println("Hello - "+Thread.currentThread().getName());
			return "Hello";
		};
		
		for(int index=1;index<=8;index++) {
			Future future=threadPool.submit(call); 	//return type Future<> obj
			System.out.println(future.get());
		}
		
		threadPool.shutdown();
		
	}

}
