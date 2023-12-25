package org.november;

public class Demo{
	
	public static  boolean  isPrime(int value) {
		if(value<0 || (value==0 || value==1)) {
			return false;
		}
		for(int index=2;index<=value/2;index++) {
			if(value%index==0) {
				return false;
			}
		}
		return true;
	}

    public static void main(String[] args) {
		
    	int [] array = {1,2,3,4};
    	int result=0;
    	for(int ele:array) {
    		if(isPrime(ele)) {
    			result+=ele;
    		}
    	}
    	System.out.println(result);
    	
	}
}
