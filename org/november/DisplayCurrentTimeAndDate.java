package org.november;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayCurrentTimeAndDate {

	public static void main(String[] args) {
		LocalDateTime dateTimeObj = LocalDateTime.now();
		DateTimeFormatter formatObj=DateTimeFormatter.ofPattern("E dd-MM-yyyy HH:mm:ss");
		String timeAndDate=dateTimeObj.format(formatObj);
		System.out.println(timeAndDate);
		
	}
	

}
