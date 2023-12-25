package org.november30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithPrimitives {

	public ArrayList createArrayList() {
		
		ArrayList primitives = new ArrayList();
		
		primitives.add(123);
		primitives.add(976.98);
		primitives.add('n');
		primitives.add(true);
		
		return primitives;
		
	}
	
	public void displayUsingFor(List primitives) {

		System.out.println("Displaying ArrayList using normal for loop");
		for (int index = 0; index < primitives.size(); index++) {
			System.out.println(primitives.get(index));
		}
		System.out.println();

		System.out.println("Displaying ArrayList using enhanced for loop");
		for (Object student : primitives) {
			System.out.println(student);
		}
		System.out.println();

	}

	public void displayUsingIterator(List primitives) {

		Iterator iterator = primitives.iterator();

		System.out.println("Displaying ArrayList using Iterator");
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		for(;iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		System.out.println();

	}
	
}
