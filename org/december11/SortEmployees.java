package org.december11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployees {
	
	public static void main(String[] args) {
		
		List<Employee> employeesList = new ArrayList<>();
		
		employeesList.add(new Employee(10,"Raji",30000));
		employeesList.add(new Employee(2,"Lakshmi",20000));
		employeesList.add(new Employee(7,"Ramu",40000));
		employeesList.add(new Employee(5,"Devi",30000));
		employeesList.add(new Employee(9,"Uma",30000));
		employeesList.add(new Employee(1,"Geetha",10000));
		
		
		Comparator<Employee> compId = (Employee emp1,Employee emp2)->{
			if(emp1.getId()>emp2.getId()) {
				return 1;
			}
			else if(emp1.getId()<emp2.getId()) {
				return -1;
			}
			return 0;
		};
		
		Comparator<Employee> compName = (Employee emp1,Employee emp2)->{
			return emp1.getName().compareTo(emp2.getName());
		};
		
		Comparator<Employee> compSalary = (Employee emp1,Employee emp2)->{
			if(emp1.getSalary()>emp2.getSalary()) {
				return 1;
			}
			else if(emp1.getSalary()<emp2.getSalary()) {
				return -1;
			}
			return emp1.getName().compareTo(emp2.getName());
			
		};
		
		System.out.println("Before Sorting \n"+employeesList);
		
		Collections.sort(employeesList , compId);
		System.out.println("Sorted based on ID : \n"+employeesList);
		
		Collections.sort(employeesList , compName);
		System.out.println("Sorted based on Name : \n"+employeesList);
		
		Collections.sort(employeesList , compSalary);
		System.out.println("Sorted based on Salary : \n"+employeesList);
		
	}

}
