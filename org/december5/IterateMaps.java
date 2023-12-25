package org.december5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMaps {

	public Map<Integer, Person> createMap() {

		Map<Integer, Person> persons = new HashMap<Integer, Person>();
		persons.put(1, new Person("Ram", 9492772382l));
		persons.put(2, new Person("uma", 9000536010l));
		persons.put(3, new Person("kiran", 7569634257l));
		persons.put(1, new Person("Ramu", 9492772382l));
		persons.put(null, new Person("Raji", 9390145041l));

		return persons;
	}

	// program1
	public void displayMap(Map<Integer, Person> persons) {

		// program3
		System.out.println("Iterating map using entrySet() method \n");
		Set<Entry<Integer, Person>> personsEntry = persons.entrySet();
		for (Entry<Integer, Person> element : personsEntry) {
			System.out.println(element);
		}
		System.out.println();

		System.out.println("Iterating map using keySet() method \n");
		Set<Integer> personsKey = persons.keySet();
//		for(Integer element:personsKey) {
//			System.out.println(element +" - "+persons.get(element));
//		}
		Iterator<Integer> iterator = personsKey.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key + " - " + persons.get(key));
		}
		System.out.println();

		System.out.println("Iterating map using forMap \n");
		for (Map.Entry<Integer, Person> entry : persons.entrySet()) {
			Integer key = entry.getKey();
			Person val = entry.getValue();
			System.out.println(key + " - " + val);
		}
		System.out.println();
	}

	// program2
	public void displayValues(Map<Integer, Person> persons) {

		System.out.println("Displaying values without keys \n");
		Collection<Person> personsValues = persons.values();
//		for(Person element:personsValues) {
//			System.out.println(element);
//		}
		Iterator<Person> iterator = personsValues.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();

	}
	

}
