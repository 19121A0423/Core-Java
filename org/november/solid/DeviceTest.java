package org.november.solid;

class Device {
	public void turnOn() {
		System.out.println("Turn on device");
	}

	public void turnOff() {
		System.out.println("Turn off device");
	}
}

class SmartPhone extends Device {

	@Override
	public void turnOn() {
		System.out.println("Turn on Smartphone");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off Smartphone");
	}
}

class Laptop extends Device {
	
	@Override
	public void turnOn() {
		System.out.println("Turn on Laptop");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off Laptop");
	}
}

public class DeviceTest {
	
	public static void main(String[] args) {
		
		Device mySmartphone = new SmartPhone();
		Device myLaptop = new Laptop();

		mySmartphone.turnOn(); // This should perform the turnOn() method defined in Smartphone
		myLaptop.turnOff();    // This should perform the turnOff() method defined in Laptop
	}
	
}
