package org.november10;

public class ProgramUsingBreak {
	
	public void printNumbers1() {
		for(int index=1;index<=100;index++) {
			if(index==47) {
				break;
			}
			System.out.print(index+" , ");
		}
	}
	
	public void printNumbers2() {
		int index=1;
		while(index<=100) {
			if(index==47) {
				break;
			}
			System.out.print(index+" , ");
			index++;
		}
	}
	
	public void printNumbers3() {
		int index=1;
		do {
			if(index==47) {
				break;
			}
			System.out.print(index+" , ");
			index++;
		}
		while(index<=100);
	}
	
	public static void main(String[] args) {
		ProgramUsingBreak programUsingBreak = new ProgramUsingBreak();
		
		programUsingBreak.printNumbers1();
		System.out.println();
		programUsingBreak.printNumbers2();
		System.out.println();
		programUsingBreak.printNumbers3();	
		
	}

}
