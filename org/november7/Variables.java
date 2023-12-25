package org.november7;

import org.november6.Person;

public class Variables {
	
	String name="CoreNuts Technology";	//instance variable
	short shortValue=192;	//instance variable declaration and initialization
	static float floatValue=738.93f;	//class variable declaration initialization
	static double doubleValue;		//class variable declaration
	Person person1;		//instance variable declaration 
	
	public static void calculate(int intValue,double doubleValue) {
		double result=intValue+doubleValue;
		System.out.println("Result="+result);
	}
	
	public void calculate2() {
		System.out.println("Non static method");
	}

	public static void main(String[] args) {
		System.out.println("Float value: "+Variables.floatValue);
		
		Variables variables=new Variables();
		System.out.println("Short value: "+variables.shortValue);
		
		int intValue=4738;	//local variable
		System.out.println("Local variable:"+intValue);
		
		Person person2=new Person();
		person2.setName("Rajeswari");
		System.out.println("Name: "+person2.getName());
		
		Variables.calculate(327,732.9733);
		
	}

}
