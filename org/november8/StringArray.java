package org.november8;

public class StringArray {

	public static void main(String[] args) {
		String states[]=new String[6];	//array declaration and instantiation
		
		// array initialization
		states[0]="Andhra Pradesh";
		states[1]="Telangana";
		states[2]="Karnataka";
		states[3]="Tamil Nadu";
		states[4]="Kerala";
		states[5]="Goa";
		
		//printing states
		System.out.println(states);
		for(int index=0;index<states.length;index++) {
			System.out.println(states[index]);
		}
		
	}

}
