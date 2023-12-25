package org.december6;

public class ThreadInSlowFace {
	
	public static void main(String[] args) {
		
		//creating thread using Thread Class
		PrintNumbers printNumbers = new PrintNumbers();
		printNumbers.start();
//		printNumbers.start();   //java.lang.IllegalThreadStateException
		
		PrintNumbers printNumbers1 = new PrintNumbers();
		printNumbers1.start();
		
		PrintNumbers printNumbers2 = new PrintNumbers();
		printNumbers2.start();
		
		
	}

}
