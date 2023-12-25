package org.december4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SubLists {

	//program7
	public void method1() {

		Set<Employee> emp = new HashSet<Employee>();

		emp.add(new Employee("A", 28277));
		emp.add(new Employee("B", 22731));
		emp.add(new Employee("C", 42872));
		emp.add(null);
		emp.add(new Employee("D", 21347));
		
		emp.add(null);

//		System.out.println(emp);

		Set<Employee> emp1 = new LinkedHashSet<Employee>();
		
//		emp1.add(null);
		emp1.add(new Employee("A", 28277));
		emp1.add(new Employee("B", 22731));
		emp1.add(new Employee("C", 42872));
		emp1.add(new Employee("D", 21347));
		emp1.add(null);
		
		System.out.println(emp1);

	}
	
	//program6
	public void method2() {

		Set<Employee> emp = new HashSet<Employee>();

		emp.add(new Employee("A", 90000));
		emp.add(new Employee("B", 20000));
		emp.add(new Employee("C", 50000));
		emp.add(new Employee("D", 10000));
		emp.add(null);

		System.out.println(emp);

		Set<Employee> emp1 = new TreeSet<Employee>();

		emp1.add(new Employee("A", 90000));
		emp1.add(new Employee("B", 20000));
		emp1.add(new Employee("C", 50000));
		emp1.add(new Employee("D", 10000));
//		emp1.add(null);		//NullPointerException

		System.out.println(emp1);

	}

}
