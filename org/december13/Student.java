package org.december13;

public class Student {

	private long id;
	private String name;
	private char gender;
	private String department;
	private String address;
	private String city;
	private String state;

	public Student(long id, String name, char gender, String department, String address, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.address = address;
		this.city = city;
		this.state = state;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department
				+ ", address=" + address + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
