package org.december11;

import java.util.function.BiConsumer;

public class CalculatorTest {
	
	public static void main(String[] args) {
		
		Calculator calculator=new Calculator();
		
		BiConsumer<Integer,Integer> consumer = calculator::sum;
		
		consumer.accept(123, 123);
		
		
	}

}
