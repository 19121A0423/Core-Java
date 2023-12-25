package org.december5;

import java.util.Comparator;

public class CompPhone implements Comparator<Person>{

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
	
	

}
