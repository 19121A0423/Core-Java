package org.november15;

public class AccessingInheritance extends AccessingProperties{

	public static void main(String[] args) {
		AccessingInheritance accessingInheritance=new AccessingInheritance();
		
		accessingInheritance.publicMethod();
		accessingInheritance.protectedMethod();
		accessingInheritance.defaultMethod();
//		accessingInheritance.privateMethod(); //The method privateMethod() from the type AccessingProperties is not visible.
		
		System.out.println(accessingInheritance.number);
		System.out.println(accessingInheritance.string);
		System.out.println(accessingInheritance.character);
//		System.out.println(accessingInheritance.decimal);  //The field AccessingProperties.decimal is not visible
	}

}
