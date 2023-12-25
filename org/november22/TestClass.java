package org.november22;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import org.junit.Test;

public class TestClass {

	
	@Test
	public void laptopTest() {
		Laptop laptop=new HP();
		System.out.println(laptop.getLaptop()); //program1
		try {
			laptop.test();						//program5
		} catch (FileNotFoundException e) {
			System.out.println("program5");
		}
	}
	
	@Test
	public void vehicleTest() {
		FourWheeler vehicle1=new Car();
		System.out.println(vehicle1.getVehicle());   //program2
		try {
			System.out.println(vehicle1.getVehicle1());				//program3
		} catch (SQLException e) {
			System.out.println("program3");
		}
		vehicle1.test();
		
			
		
	}
}
