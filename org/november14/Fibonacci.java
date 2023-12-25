package org.november14;

public class Fibonacci {

	public void printFibonacci(int endPoint) {
		float end=endPoint;
		int a=1;
		int b=1;
		int c=0;
		int sum=0;
		while(endPoint>0) {
			System.out.print(a+" ");
			sum+=a;
			c=a+b;
			a=b;
			b=c;
			endPoint--;
		}
		System.out.println();
		System.out.println("The average is "+sum/end);
	}
	
	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		int endPoint=20;
		fibonacci.printFibonacci(endPoint);
		
	}

}
