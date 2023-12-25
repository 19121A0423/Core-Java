package org.november;

public class SingleTon {
	
	private static SingleTon obj;
	
	private SingleTon() {
		
	}
	
	public static SingleTon createObj() {
		if(obj==null) {
			obj = new SingleTon();
		}
		return obj;
	}
	
}

