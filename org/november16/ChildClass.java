package org.november16;

public class ChildClass implements  ChildInterface{

	public static void main(String[] args) {
		
	}

	@Override
	public void abstractMethod1() {
		System.out.println("Parent Abstract method");
	}

	@Override
	public void abstractMethod() {
		System.out.println("Abstract Method");
	}

	@Override
	public void publicMethod() {
		System.out.println("public method");
	}

//	@Override
//	public void privateMethod() {
//		System.out.println("private method");
//	}
//
//	@Override
//	public void protectedMethod() {
//		System.out.println("Protected Method");
//	}

}
