package org.november15;

public class NonAccessModifiersTest extends  AbstractProperties
{
	
	public static void main(String[] args) {
		
		// Accessing final variables and methods
		FinalProperties finalProperties = new FinalProperties();
		System.out.println(finalProperties.CONSTANT);
		finalProperties.finalMethod();
		
		// Accessing abstract methods
		NonAccessModifiersTest nonAccessModifiersTest = new NonAccessModifiersTest();
		nonAccessModifiersTest.abstractMethod();
		
		//creating object for abstract class
//		AbstractProperties AbstractProperties=new AbstractProperties(); //Cannot instantiate the type AbstractProperties
	}

@Override
public void abstractMethod() {
System.out.println("Abstract method");	
}

}
