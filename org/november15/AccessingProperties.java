package org.november15;

public class AccessingProperties {
	
	public int number=193;
	protected String string = "String";
	char character='j';
	private double decimal=729.92;
	
	public void publicMethod() {
		System.out.println("public method");
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

	public static void main(String[] args) {
		AccessingProperties accessingProperties = new AccessingProperties();
		
		accessingProperties.privateMethod();
		System.out.println(accessingProperties.decimal);
		
	}

}
