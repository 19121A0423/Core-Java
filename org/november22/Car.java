package org.november22;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Car extends FourWheeler {

//	//program2
//	@Override
//	public FourWheeler getVehicle() throws FileNotFoundException {
//		return new Car();
//	}

	// program3
	@Override
	public FourWheeler getVehicle1()  throws ArithmeticException{
		return new Car();
	}

	// program4
	@Override
	public void test() {
		System.out.println("Vehicle");
	}
	
	public void test1() throws FileNotFoundException{
		FileNotFoundException d=new FileNotFoundException("file.txt");
		System.out.println("test4");
	}
	
	public static void main(String[] args) {
		FourWheeler d=new Car();
		d.getVehicle();
	}

}
