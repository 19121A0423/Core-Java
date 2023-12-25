package org.december4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSet {

	Comparator<Employee> compSalary = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {

			if (emp1.getSalary() > emp2.getSalary()) {
				return 1;
			}

			else if (emp1.getSalary() < emp2.getSalary()) {
				return -1;
			} else {
				return 0;
			}
		}
	};

	Comparator<Employee> compName = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {

			return emp1.getName().compareTo(emp2.getName());
		}
	};

	//program2 and program3
	public void createEmpSet1() {

		Set<Employee> employees = new LinkedHashSet<Employee>();

		employees.add(new Employee("Rajeswari", 25000));
		employees.add(new Employee("Lakshmi", 30000));
		employees.add(new Employee("Geetha", 15000));
		employees.add(new Employee("Anvitha", 20000));

		employees.add(new Employee("Geetha", 15000));
		employees.add(new Employee("Rajeswari", 25000));

		display(employees);
		System.out.println();

	}
	
	//program5
	public void createEmpSet2() {
		
		Set<Employee> employees1 = new TreeSet<Employee>(compName);
		
//		Set<Employee> employees1 = new TreeSet<Employee>(compSalary);

		employees1.add(new Employee("Rajeswari", 25000));
		employees1.add(new Employee("Lakshmi", 30000));
		employees1.add(new Employee("Geetha", 15000));
		employees1.add(new Employee("Anvitha", 20000));
		
		employees1.add(new Employee("Rajeswari", 25000));
		employees1.add(new Employee("Lakshmi", 30000));
		
		display(employees1);
		System.out.println();
	}

	public void display(Set<Employee> employees) {
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
//			Employee employee = (Employee) iterator.next();
			System.out.println(iterator.next());

		}

	}

}
