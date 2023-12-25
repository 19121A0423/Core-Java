package org.november22;

import java.io.IOException;

public class HP extends Laptop {
	
	
//	@Override
//	public Object getLaptop() { //The return type is incompatible with Laptop.getLaptop()
//		return 	new HP();
//	}
	
	//program1
	@Override
	public Laptop getLaptop() throws ArithmeticException
	{
//		System.out.println(83/0);
		return 	new HP();
	}
	
	//program5
	public void test()  
	{
		System.out.println("Laptop");
		
	}
	
	
	
	
	
	
}
