package org.december4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListAndSet {

	//program8
	public void list() {

		List<String> places = new ArrayList<String>();

		places.add("Kadapa");
		places.add("Chittor");
		places.add("Ananthapur");
		places.add("Nellore");
		places.add(null);
		places.add("Kurnool");
		places.add("Ananthapur");
		places.add("Nellore");
		places.add(null);

//		System.out.println(places);
		displayList(places);

	}

	//program9
	public void displayList(List<String> places) {

		
		ListIterator iterator = places.listIterator();

		System.out.println("Displaying students using ListIterator in forward direction");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();

		ListIterator iterator1 = places.listIterator(places.size());
		System.out.println("Displaying students using ListIterator in backward direction");
		while (iterator1.hasPrevious()) {
			System.out.println(iterator1.previous());
		}
		System.out.println();

	}

	//program8
	public void set() {

		Set<Character> places = new HashSet<Character>();

		places.add('h');
		places.add('w');
		places.add(null);
		places.add('a');
		places.add('t');
		places.add('h');
		places.add('w');
		places.add(null);

//		System.out.println(places);
		displaySet(places);

	}

	public void displaySet(Set<Character> places) {

		Iterator iterator = places.iterator();

		System.out.println("Displaying students using ListIterator in forward direction");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();


	}
	
	//program10
	public void subList() {
		
		List<String> places1 = new ArrayList<String>();

		places1.add("Kadapa");
		places1.add("Chittor");
		places1.add("Ananthapur");
		places1.add("Nellore");
		places1.add(null);
		
		List<String> places2 = new ArrayList<String>();
		
		places2.add("Kurnool");
		places2.add("Guntur");
		places2.add("Nellore");
		places2.add(null);
		
		List<String> places = new ArrayList<String>();
		places.addAll(places1);
		places.addAll(places2);
		
		System.out.println(places);
		
		displaySubList(places,3,8);
	}
	
	
	public void displaySubList(List<String> places , int index1,int index2) {
		
		for(int index=index1;index<index2;index++) {
			System.out.println(places.get(index));
		}
		System.out.println();
		
	}

}
