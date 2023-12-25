package org.december7;

import java.util.Objects;

public class Employee {
	
	private String name;
	private String dept;
	private String location;
	
	public Employee(String name,String dept,String location) {
		this.name=name;
		this.dept=dept;
		this.location=location;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDept(String dept) {
		this.dept=dept;
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,dept,location);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null && (getClass() != obj.getClass())) {
			return false;
		}
		Employee emp = (Employee)obj;
		return getName().equals(emp.getName()) && getDept().equals(emp.getDept()) &&
				getDept().equals(emp.getDept());
	}
	
	@Override
	public String toString() {
		return "Employee [ name : "+this.getName()+" dept : "+this.getDept()+" location : "+this.getLocation()+" ]";
	}

}
