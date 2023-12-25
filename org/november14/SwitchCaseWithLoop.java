package org.november14;

public class SwitchCaseWithLoop {
	
	public void switchCaseWithBreak() {
		for(int index=1;index<=5;index++) {
			switch(index) {
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			case 4:
				System.out.println("case 4");
				break;
			case 5:
				System.out.println("case 5");
				break;
			default:
				System.out.println("Default");
			}
		}
	}
	
	public void switchCaseWithOutBreak() {
		for(int index=1;index<=5;index++) {
			switch(index) {
			case 1:
				System.out.println("case 1");
			case 2:
				System.out.println("case 2");
			case 3:
				System.out.println("case 3");
			case 4:
				System.out.println("case 4");
			case 5:
				System.out.println("case 5");
			default:
				System.out.println("Default");
			}
		}
	}

	public static void main(String[] args) {
		SwitchCaseWithLoop switchCaseWithLoop=new SwitchCaseWithLoop();
		
		switchCaseWithLoop.switchCaseWithBreak();
		System.out.println("---------------------------");
		switchCaseWithLoop.switchCaseWithOutBreak();
	}

}
