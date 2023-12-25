package org.november15;

public class AccessModifiers {
	
	public int publicVariable;
	protected double protectedVariable;
	long defaultVariable;
	private String privateVariable;
	
	
	public void publicMethod() {
		System.out.println("public method");
		
//		private int number=7493;  //Illegal modifier for parameter number; 
//		only final is permitted
	}
	
	protected void protectedMethod() {
		System.out.println("protected method");
	}
	
	void defaultMethod() {
		System.out.println("default method");
	}
	
	private void privateMethod() {
		System.out.println("private method");
	}

	

}
