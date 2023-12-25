package org.november14;

import java.util.Random;

public class GeneratingRandomValues {
	
	public void check(int num1,int num2) {
		if(num1==num2) {
			System.out.println("Both Values are equal");
		}
		else if(num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}
		else {
			System.out.println(num1+" is lesser than "+num2);
		}
	}

	public static void main(String[] args) {
		
		GeneratingRandomValues generatingRandomValues=new GeneratingRandomValues();
		Random random=new Random();
		
		for(int index=1;index<=25;index++) {
			int value1=random.nextInt(100);
			int value2=random.nextInt(100);
			generatingRandomValues.check(value1,value2);
		}
		
		
		
	}

}
