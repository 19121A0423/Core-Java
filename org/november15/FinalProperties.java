package org.november15;

public class FinalProperties {
	
	final int CONSTANT=849;

	public final void finalMethod() {
//		CONSTANT=748;	//The final field FinalProperties.CONSTANT cannot be assigned
		System.out.println("Final Method");
	}

	public void finalMethod(int number) //we can overload final method
	{
		System.out.println("Overloaded final method");
	}
	
	
}
