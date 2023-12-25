package org.november21;

public class TwoWheeler extends Vehicle{
	
//	@Override
//	public Object getVehicle() {
//		return new TwoWheeler();
//	}
	
	public Vehicle getVehicle() {
		return new Bike();
	}
	
	@Override
	public void test1() {
		super.test1();
		System.out.println("Twowheeler test1");
	}

}
