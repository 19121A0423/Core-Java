package org.november6;

public class Child extends Parent{
	Child(String name,int age,long phone)
	{
		this.name=name;
		this.age=age;
		this.phone=phone;
	}
	public static void main(String[] args) {
		System.out.println("Execution started");
		Child child1=new Child("Rajeswari",21,9390145041l);
		System.out.println("Execution ended");
	}
}
