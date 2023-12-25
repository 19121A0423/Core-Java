package org.december5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapsSort {

	public void sortMaps() {

//		Map<Person, Integer> persons = new TreeMap<Person, Integer>(new CompName());
//
////		persons.put( null,43);	//java.lang.NullPointerException
//
//		persons.put(new Person("Uma", 9000536010l), 24);
//		persons.put(new Person("Kiran", 7569634257l), 64);
//		persons.put(new Person("Ramu", 9492772382l), 63);
//		persons.put(new Person("Raji", 9390145041l), 96);
//
//		System.out.println(persons);

		Map<Person, Integer> persons = new HashMap<Person, Integer>();

		persons.put(new Person("Uma", 9000536010l,"kadapa"), 24);
		persons.put(new Person("Kiran", 7569634257l,"kurnool"), 64);
		persons.put(new Person("Ramu", 9492772382l,"nellore"), 63);
		persons.put(new Person("Raji", 9390145041l,"chittor"), 96);

		Map<Person, Integer> sortMapBasedOnNames = new TreeMap<Person, Integer>(persons);	//sort based on names
		
		for (Entry<Person, Integer> entry : sortMapBasedOnNames.entrySet()) {
			System.out.println(entry.getKey());
		}

	}
	
	public static void main(String[] args) {
		MapsSort mapsSort = new MapsSort();
		mapsSort.sortMaps();
	}

}
