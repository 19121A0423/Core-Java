package org.november.solid;

public class Laptop1 implements BasicFunctionality, InternetBrowser {

	@Override
	public void browseInternet() {
		System.out.println("browsing internet");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Turn on mobile");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off mobile");
		
	}
    
}
