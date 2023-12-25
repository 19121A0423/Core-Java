package org.november16;

public interface ChildInterface extends Interface {
	
	void abstractMethod();
	public void publicMethod();
	
	default void defaultMethod() {
	}
	
//	private void privateMethod(); //Illegal modifier for the interface method privateMethod; 
//	only public, abstract, default, static and strictfp are permitted
	
//	protected void protectedMethod();	//Illegal modifier for the interface method protectedMethod;
	

}
