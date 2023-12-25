package org.november10;

import java.util.Scanner;

public class ElectricityBill {
	
	public void calculateElectricityBill(int unitsConsumed) {
		if(unitsConsumed<=50) {
			System.out.println("ElectricityBill: "+250);
			System.out.println("Minimum Usage");
		}
		else if(unitsConsumed>50 && unitsConsumed<=100) {
			System.out.println("ElectricityBill: "+(unitsConsumed*5));
			System.out.println("Moderate Usage");
		}
		else {
			System.out.println("ElectricityBill: "+(unitsConsumed*8));
			System.out.println("High Usage");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ElectricityBill electricityBill=new ElectricityBill();
		
		System.out.println("enter number of units consumed");
		int unitsConsumed=scanner.nextInt();
		electricityBill.calculateElectricityBill(unitsConsumed);
		
	}

}
