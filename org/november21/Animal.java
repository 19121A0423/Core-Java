package org.november21;

public class Animal {
	
	public Animal returnObj() {  // but we cant use subclass inplace of Animal
		return new Animal();
	}
	
//	public Dog returnObj() {	//Type mismatch: cannot convert from Animal to Dog
//		return new Animal();
//	}
	
	public Dog returnObj1() {	
		return new Dog();
	}
	
	
	public void sound() {
		System.out.println("Animal sound");
	}
	
}
