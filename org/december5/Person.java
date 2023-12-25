package org.december5;

import java.util.Objects;

public class Person implements Comparable<Person>{

	private String name;
	private long phone;
	private String location;

	public Person(String name, long phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public Person(String name, long phone, String location) {
		super();
		this.name = name;
		this.phone = phone;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(location, other.location) && Objects.equals(name, other.name) && phone == other.phone;
	}

	@Override
	public int compareTo(Person o) {
		
		return this.getName().compareTo(o.getName());
	}
	
	
	
}
