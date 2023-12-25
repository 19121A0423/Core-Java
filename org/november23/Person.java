package org.november23;

public class Person {
	
	String name;
	int age;
	String profession="UnEmployee";
	
	public Person() {
	}
	
	public Person(String name) {
		this();
		this.name=name;
	}
	
	public Person(String name,int age) {
		this(name);
		this.age=age;
	}

	@Override
	public String toString() {
		return "Person  name=" + name + ", age=" + age + ", profession=" + profession;
	}
	
	

}
