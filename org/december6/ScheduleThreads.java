package org.december6;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreads {
	
	public static void main(String[] args) {
		
		ScheduledExecutorService scheduledThread = Executors.newScheduledThreadPool(7);
		
		Runnable runnable=() -> {
			System.out.println("Scheduled Thread ");
		};
		
		scheduledThread.scheduleAtFixedRate(runnable, 5 , 10 , TimeUnit.SECONDS);
		
	}

}
