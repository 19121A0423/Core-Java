package org.december4;

import java.util.Objects;

public class Employee  implements Comparable<Employee> 
{
	
	private String name;
	private Double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee  name=" + name + ", salary=" + salary ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public int compareTo(Employee emp) {
		
//		return this.name.compareTo(emp.name);
		
		if(this.salary < emp.salary) {
			return -1;
		}
		else if(this.salary > emp.salary) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	

}
