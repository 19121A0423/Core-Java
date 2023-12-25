package org.november9;

public class RelationalOperators {
	
	public void checkGreater(int value1,int value2) {
		System.out.println("Value1 is greater than Value2: "+ (value1>value2));
	}
	
	public void checkLesser(int value1,int value2) {
		System.out.println("Value1 is lesser than Value2: "+ (value1<value2));
	}

	public void checkGreaterThanOrEqual(int value1,int value2) {
		System.out.println("Value1 is greater than or equal to Value2: "+ (value1>=value2));
	}

	public void checkLessThanOrEqual(int value1,int value2) {
		System.out.println("Value1 is lesser than or equal to Value2: "+ (value1<=value2));
	}

	public void checkEqual(int value1,int value2) {
		System.out.println("Value1 is equal to Value2: "+ (value1==value2));
	}
	
	public void checkNotEqual(int value1,int value2) {
		System.out.println("Value1 is not equal to Value2: "+ (value1!=value2));
		System.out.println("Value1 is not equal to Value2: "+ !(value1==value2));
	}
	
	public static void main(String[] args) {
		RelationalOperators relationalOperators = new RelationalOperators();
		
		relationalOperators.checkGreater(356,672);
		relationalOperators.checkLesser(537,987);
		relationalOperators.checkGreaterThanOrEqual(245,658);
		relationalOperators.checkLessThanOrEqual(154,972);
		relationalOperators.checkEqual(100,100);
		relationalOperators.checkNotEqual(257,963);
		
	}

}
