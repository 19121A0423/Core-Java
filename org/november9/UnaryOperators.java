package org.november9;

public class UnaryOperators {
	
	public void preIncrement(int value) {
		System.out.println("PreIncrement Value: "+ ++value);
	}
	
	public void postIncrement(int value) {
		System.out.println("PostIncrement Value: "+ value++);
	}
	
	public void preDecrement(int value) {
		System.out.println("PreDecrement Value: "+ --value);
	}
	
	public void postDecrement(int value) {
		System.out.println("PostDecrement Value: "+ value--);
	}
	
	public static void main(String[] args) {
		UnaryOperators unaryOperators=new UnaryOperators();
		
		unaryOperators.preIncrement(1);
		unaryOperators.postIncrement(5);
		unaryOperators.preDecrement(11);
		unaryOperators.postDecrement(1);
	}

}

