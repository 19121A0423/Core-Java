package org.december5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
	
	Comparator compName = new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	};
	
	Comparator compLocation = new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getLocation().compareTo(o2.getLocation());
		}
		
	};
	
	Comparator compPhone = new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			if(o1.getPhone() > o2.getPhone()) {
				return 1;
			}
			
			else if(o1.getPhone() < o2.getPhone()) {
				return -1;
			}
			else {
				return 0;
			}
		}
		
	};
	
	public void sortlistElements() {
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Raji", 9298763454l,"Bangalore"));
		persons.add(new Person("Geetha", 3345345645l,"Hyderabad"));
		persons.add(new Person("Lakshmi", 4341387654l,"Chennai"));
		
		System.out.println("Before sorting : "+persons);
		System.out.println();
		
		Collections.sort(persons);
		System.out.println("After sorting : "+persons);
		System.out.println();
		
//		Collections.sort(persons,compName);
//		System.out.println("After sorting : "+persons);
//		System.out.println();
		
		Collections.sort(persons,compLocation);
		System.out.println("After sorting : "+persons);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		SortList sortList = new SortList();
		sortList.sortlistElements();
	}

}
