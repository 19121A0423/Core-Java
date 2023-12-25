package org.december4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Primitives {
	
	
	//program1
	public void createSet() {
		
		Set<Integer> setInt = new HashSet();
		setInt.add(10);
		setInt.add(20);
		setInt.add(30);
		setInt.add(40);
		setInt.add(50);
		setInt.add(40);
		
//		setInt.add(null);
		
		System.out.println(setInt);
		sortSet(setInt);
		
	}
	
	//program4
	public void sortSet(Set<Integer> setInt) {
		
//		Collections.sort(primitives);     //The method sort(List<T>) in the type Collections is not applicable for the arguments (Set<Integer>)
		
		Set<Integer> setInt1 = new TreeSet<Integer>();
		setInt1.addAll(setInt);
		
		System.out.println("Before Sorting : "+setInt);
		System.out.println("After Sorting : "+setInt1);
		
	}

}
