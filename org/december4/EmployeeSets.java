package org.december4;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSets {
	
	public Set<Employee> createEmpSet() {

		Set<Employee> empSet = new HashSet<Employee>();

		empSet.add(new Employee("Rajeswari", 25000));
		empSet.add(new Employee("Lakshmi", 30000));
		empSet.add(new Employee("Geetha", 15000));
		empSet.add(new Employee("Anvitha", 20000));
		empSet.add(new Employee("Geetha", 15000));
		empSet.add(new Employee("Rajeswari", 25000));
		
		return empSet;

	}
	
	
	public static void main(String[] args) {
		
		EmployeeSets employeeSetsObj = new EmployeeSets();
		Set<Employee> empSet = employeeSetsObj.createEmpSet();
		for (Employee employee : empSet) {
			System.out.println(employee);
		}
		
	}

}
