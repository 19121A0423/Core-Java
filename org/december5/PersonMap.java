package org.december5;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PersonMap {

	public Map createPersonMap() {

		Map<Person, Integer> persons = new LinkedHashMap<Person, Integer>();

		persons.put(null, 1);
		persons.put(new Person("uma", 9000536010l), 2);
		persons.put(new Person("kiran", 7569634257l), 3);
		persons.put(new Person("Ramu", 9492772382l), 4);
		persons.put(new Person("Raji", 9390145041l), null);
		persons.put(new Person("Raji", 9390145041l), 10);
		persons.put(null, 29);
		
		return persons;
	}

	public void display(Map<Person, Integer> persons) {

		Set<Entry<Person, Integer>> personsEntry = persons.entrySet();
		for (Entry<Person, Integer> element : personsEntry) {
			System.out.println(element);
		}
		System.out.println();
	}

	public Map createHashTable() {

		Map<Integer, Person> persons = new Hashtable<Integer, Person>();

		persons.put(1, new Person("Ram", 9492772382l));
		persons.put(2, new Person("uma", 9000536010l));
//		persons.put(3, null);    // we cant store null values in hashtable in keya and values
		persons.put(1, new Person("Ramu", 9492772382l));
//		persons.put(null, null);
		
	
		
		return persons;
		
	}

}
