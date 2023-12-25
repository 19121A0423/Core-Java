package org.november21;

public class Program3 {
	
	public Animal returnObject(String string) {
		return new Dog();
	}
	
	public Animal returnObject(int number) {
		return new Animal();
	}
	
	public Dog returnObject(double decimal) {
		return new Dog();
//		return new Animal();   Type mismatch: cannot convert from Animal to Dog
	}
	
//	public SBIBank returnobj() {	//Type mismatch: cannot convert from HDFCBank to SBIBank
//		return new HDFCBank();
//	}
	
}
