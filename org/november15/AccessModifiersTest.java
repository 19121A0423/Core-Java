package org.november15;

public class AccessModifiersTest {

	public static void main(String[] args) {
		AccessModifiers accessModifiers = new AccessModifiers();
		accessModifiers.publicMethod();
		accessModifiers.defaultMethod();
//		accessModifiers.privateMethod();
		accessModifiers.protectedMethod();
		
		System.out.println(accessModifiers.publicVariable);
		System.out.println(accessModifiers.protectedVariable);
		System.out.println(accessModifiers.defaultVariable);
//		System.out.println(accessModifiers.privateVariable);

	}

}
