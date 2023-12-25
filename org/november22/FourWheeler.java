package org.november22;

import java.sql.SQLException;

public class FourWheeler {
	
	//program2
	public Object getVehicle() {
		return new FourWheeler();
	}
	
	//program3
	public Object getVehicle1() throws SQLException {
		return new FourWheeler();
	}
	
	//program4
	public void test() throws RuntimeException{
		System.out.println("Vehicle");
	}
	
	
	public void test1() throws Exception{
		System.out.println("test4");
	}
}
