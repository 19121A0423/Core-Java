package org.november3;

public class Prime {
	
	public static void main(String[] args) {
		int n1=76;
		int n2=63;
		int n3=13;
		System.out.println(isPrime(n1)?"Prime number":"Not a prime number");
		System.out.println(isPrime(n2)?"Prime number":"Not a prime number");
		System.out.println(isPrime(n3)?"Prime number":"Not a prime number");
	}
	
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
