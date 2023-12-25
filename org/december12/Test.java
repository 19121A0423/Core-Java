package org.december12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		Random random = new Random();
		for(int index=0;index<10000;index++) {
			arrayList.add(random.nextInt());
		}
		
		long time1 = System.currentTimeMillis();
		long sum=0;
		List<Integer> evenArrayList = new ArrayList<Integer>();
		for(Integer value:arrayList) {
			if(value%2==0) {
				evenArrayList.add(value);
				sum+=value;
			}
		}
		
		long time2 = System.currentTimeMillis();
		
		System.out.println(time2-time1);
		
//		long timeStart1 = System.currentTimeMillis();
		long evenSum =arrayList.stream().filter(i -> i%2==0).reduce(0,(a,b) -> a+b);
		long time3 = System.currentTimeMillis();
		
		System.out.println(time3-time2);
	}
	
}
