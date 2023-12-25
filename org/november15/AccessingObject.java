package org.november15;

public class AccessingObject {

	public static void main(String[] args) {
		AccessingProperties accessingProperties = new AccessingProperties();
		
		accessingProperties.publicMethod();
		accessingProperties.protectedMethod();
		accessingProperties.defaultMethod();
//		accessingProperties.privateMethod(); //The method privateMethod() from the type AccessingProperties is not visible.
		
		System.out.println(accessingProperties.number);
		System.out.println(accessingProperties.string);
		System.out.println(accessingProperties.character);
//		System.out.println(accessingProperties.decimal);  //The field AccessingProperties.decimal is not visible
		
	
	}

}
