package org.november23;

public class Form {
	
	String name;
	long phoneno;
	static String institute;
	
	public Form(String name,long phoneno,String institute) {
		this(institute);
		this.name=name;
		this.phoneno=phoneno;
//		this.institute="Jspiders";
	}
	public Form(String institute) {
		
		this.institute=institute;
	}

	@Override
	public String toString() {
		return "Form  name=" + name + ", phoneno=" + phoneno +", institute name=" + institute ;
	}
	
	
	
	

}
