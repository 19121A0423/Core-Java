package org.november.solid;

public class SmartMobile implements BasicFunctionality, MediaPlayer, InternetBrowser{

	@Override
	public void browseInternet() {
		System.out.println("browsing internet");
		
	}

	@Override
	public void playMedia() {
		System.out.println("play media");
		
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
