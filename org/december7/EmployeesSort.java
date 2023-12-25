package org.december7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeesSort {
	
	public static void main(String[] args) {
		
//		Comparator<Integer> compInteger=(value1,value2) -> {
//			if(value1 > value2) {
//				return 1;
//			}
//			else if(value1 < value2) {
//				return -1;
//			}
//			return 0;
//		};
		
		Comparator<Employee> compName = (emp1,emp2) -> {
			return emp1.getName().compareTo(emp2.getName());
		};
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Raji","IT","Banglore"));
		employeeList.add(new Employee("Amrutha","Non-IT","Hyderabad"));
		employeeList.add(new Employee("Sushma","IT","Chennai"));
		employeeList.add(new Employee("Vinay","IT","Banglore"));
		
		System.out.println("Before sorting : "+employeeList);
		
		Collections.sort(employeeList,compName);

		System.out.println("After sorting : "+employeeList);
		
	}

}
