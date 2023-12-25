package org.december12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.november3.Prime;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		
		Random random =  new Random();
		for(int index=0;index<100;index++) {
			arrayList.add(random.nextInt(500));
		}
		
		System.out.println(arrayList);
		List<Integer> primeList = arrayList.stream().filter(Prime::isPrime).collect(Collectors.toList());
		
		System.out.println(primeList);
	}

}
