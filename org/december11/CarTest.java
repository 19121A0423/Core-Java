package org.december11;

import java.util.function.Supplier;

public class CarTest {
	
	public static void main(String[] args) {
		
		Supplier<String> carName=Car::getName;
		System.out.println(carName.get());
		
		Supplier<String> carColor=Car::getColor;
		System.out.println(carColor.get());
		
	}

}
