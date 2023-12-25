package org.november21;

import org.junit.Test;

public class TestClass {
	
	@Test
	public void animalTest() {
		Animal animal1=new Dog();
//		animal1.food();	//The method food() is undefined for the type Animal
		animal1.sound();
		System.out.println(animal1.returnObj());
		
		animal1 = new Animal();
		System.out.println(animal1.returnObj());
		
//		Dog dog=new Animal();	//Type mismatch: cannot convert from Animal to Dog
//		Dog dog=(Dog)new Animal();   //runtime exception
		
		Dog dog1=new Dog();
		dog1.food();
		System.out.println(dog1.returnObj());
		System.out.println();
	}
	
	@Test
	public void bankTest() {
		Bank bank1=new HDFCBank();
		System.out.println("Bank1 : "+bank1.bankObj().getClass());
		bank1.minimumBalance();
		
		Bank bank2=new SBIBank();
		System.out.println("Bank2 : "+bank2.bankObj());
		bank2.minimumBalance();
		System.out.println();
	}
	
	@Test
	public void empTest() {
		Employee employee1=new Employee();
		employee1.setEmpId(1);
		employee1.setUsername("Rajeswari");
		employee1.setPassword("raji@30");
		
		System.out.println(employee1.getEmpId());
		System.out.println(employee1.getUsername());
		System.out.println(employee1.getPassword());
		System.out.println();
	}
	
	@Test
	public void program3Test() {
		Program3 program=new Program3();
		System.out.println(program.returnObject("dog"));
		System.out.println(program.returnObject(2));
		System.out.println(program.returnObject(43.6));
		System.out.println();
		
	}
	
	@Test
	public void mobileTest() {
		Mobile mobile1=new RealMe();
		Mobile mobile2=new Vivo();
		System.out.println(mobile1.getMobile());
		System.out.println(mobile2.getMobile());
		System.out.println(new Mobile().getMobile());
		System.out.println();
	}
	
	@Test
	public void VehicleTest() {
		Vehicle vehicle1=new TwoWheeler();
		Vehicle vehicle2=new Bike();
		Vehicle vehicle3=new Vehicle();
		
		System.out.println(vehicle1.getVehicle());
		System.out.println(vehicle2.getVehicle());
		System.out.println(vehicle3.getVehicle());
		System.out.println();
	}
	
}
