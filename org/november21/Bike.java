package org.november21;

public class Bike extends TwoWheeler{
	
	public Bike getVehicle() {
		return new Bike();
		
	}
	
	@Override
	public void test1() {
		System.out.println("Bike test2");
		super.test1();
	}
	
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.test2();
	}

}
