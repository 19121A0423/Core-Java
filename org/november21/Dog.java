package org.november21;

public class Dog extends Animal{
	
	public void food() {
		System.out.println("Meat");
	}
	
	@Override
	public Dog returnObj() { 
		return new Dog();
//		return  (Dog)new Animal();     //runtime error
	}
	
//	@Override
//	public Animal returnObj1() {	//The return type is incompatible with Animal.returnObj1()
//		return new Animal();
//	}

}
