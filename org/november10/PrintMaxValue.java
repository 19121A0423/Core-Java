package org.november10;

public class PrintMaxValue {
	
	public int findMax1(int value1,int value2,int value3) {
		if(value1>value2) {
			if(value1>value3) {
				return value1;
			}
			else {
				return value3;
			}
		}
		if(value2>value3) {
			return value2;
		}
		else {
			return value3;
		}
	}
	
	public int findMax2(int value1,int value2,int value3) {
		int result = value1>value2?value1>value3?value1:value3:value2>value3?value2:value3;
		return result;
	}
	
	public static void main(String[] args) {
		PrintMaxValue printMaxValue = new PrintMaxValue();
		
		int maxValue1=printMaxValue.findMax1(19137,9137,19137);
		System.out.println("First Maximum Value : "+maxValue1);
		
		int maxValue2=printMaxValue.findMax2(8373,93674,627);
		System.out.println("Second Maximum Value : "+maxValue2);
		
		
	}

}
