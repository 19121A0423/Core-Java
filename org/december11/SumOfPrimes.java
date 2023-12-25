package org.december11;

import java.util.function.Function;
import java.util.function.Predicate;

import org.november3.Prime;

public class SumOfPrimes {
	
	public static void main(String[] args) {
		
		//using lambda function
		Predicate<Integer> predicate1=(Integer value)->{
			if(value<=1) {
				return false;
			}
			for(int index=2;index<=value/2;index++) {
				if(value%index==0) {
					return false;
				}
			}
			return true;
		};
		
		int result=0;
		for(int index=0;index<10;index++) {
			if(predicate1.test(index)) {
				result+=index;
			}
		}
		System.out.println("Sum  of prime numbers : "+result);
		
		//using method refrence
		Predicate<Integer> predicate = Prime::isPrime;
		
		int sum=0;
		for(int index=1;index<10;index++) {
			if(predicate.test(index)) {
				sum+=index;
			}
		}
		
		System.out.println("Sum  of prime numbers : "+sum);
	
	}

}
