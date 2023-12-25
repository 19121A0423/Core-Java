package org.november21;

public class Mobile {
	
	protected Object getMobile() {
		return new Mobile();
	}
	
	public static void main(String[] args) {
		SimCard sim1=new SimCard();
		System.out.println(sim1);
	}

}
