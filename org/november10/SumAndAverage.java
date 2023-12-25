package org.november10;

public class SumAndAverage {
	
	public void findSumAndAverage(int upperBound) {
		int sum=0;
//		int sum=(upperBound*(upperBound+1))/2;
		for(int index=1;index<=upperBound;index++) {
			sum+=index;
		}
		float average=sum/(float)upperBound;
		System.out.println("The Sum is "+sum);
		System.out.println("The Average is "+average);
	}

	public static void main(String[] args) {
		SumAndAverage sumAndAverage = new SumAndAverage();
		
		int upperBound=100;
		sumAndAverage.findSumAndAverage(upperBound);
		
	}

}
