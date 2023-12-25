package org.november6;

public class HelloWorld {
	long longValue=82892937849l;
	double doubleValue=849484.859;
	
	void display() {
		System.out.println("Display method");
	}
	
	public static void main(String[] args) {
		System.out.println("HelloWorld");
		HelloWorld hw=new HelloWorld();
		System.out.println(hw.doubleValue);
	}

}
