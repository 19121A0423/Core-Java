package org.december8;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class FunctionalInterfaceTest {
	
	public static void main(String[] args) {
		
		Predicate<Integer> evenOrOdd = (n) -> {
			if(n%2==0) {
				return true;
			}
			return false;
			
		};
		
		System.out.println(evenOrOdd.test(20)?"Even number":"Odd number");
		
		BiConsumer<Integer, Integer> add = (value1,value2) -> {
			System.out.println(value1+value2);
		};
		
		add.accept(10, 20);
		
	}
	

}
