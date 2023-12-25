package org.november;

import org.november15.AccessModifiers;

public class AccessModifierTest extends AccessModifiers{

	public static void main(String[] args) {
		AccessModifierTest accessModifiersTest = new AccessModifierTest();
		accessModifiersTest.publicMethod();
//		accessModifiersTest.defaultMethod();
//		accessModifiersTest.privateMethod();
		accessModifiersTest.protectedMethod();
		
		System.out.println(accessModifiersTest.publicVariable);
		System.out.println(accessModifiersTest.protectedVariable);
//		System.out.println(accessModifiersTest.defaultVariable);
//		System.out.println(accessModifiers.privateVariable);
	}

}
