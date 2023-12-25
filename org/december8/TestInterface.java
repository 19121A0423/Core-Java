package org.december8;

public class TestInterface /* implements CheckInterface */{

//	@Override
//	public boolean check(int n) {
//		if(n%2==0) {
//			return true;
//		}
//		return false;
//		
//	}
	
	
	public static void main(String[] args) {
		
//		TestInterface testInterface = new TestInterface();
//		System.out.println(checkEvenOrOdd.check(35)?"Even":"Odd");
		
		CheckInterface checkInterface=(number) -> {
			if(number%2==0) {
				return true;
			}
			return false;
		};
		System.out.println(checkInterface.check(37)?"Even Number":"Odd Number");
		
		PrintInterface print = (limit) -> {
			for(int index=1;index<=limit;index++) {
				System.out.print(index+" ");
			}
		};
		print.printNumbers(10);
		
	}

}
