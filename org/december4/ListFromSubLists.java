package org.december4;

import java.util.ArrayList;
import java.util.List;

public class ListFromSubLists {

	public List<String> createList() {

		List<String> places1 = new ArrayList<String>();

		places1.add("Kadapa");
		places1.add(null);
		places1.add("Chittor");
		places1.add("Ananthapur");
		places1.add("Nellore");

		List<String> places2 = new ArrayList<String>();

		places2.add("Kurnool");
		places2.add("Guntur");
		places2.add("Nellore");
		places2.add(null);

		List<String> places = new ArrayList<String>();
		places.addAll(places1);
		places.addAll(places2);

		return places;

//		System.out.println(places);

	}

	public void displaySubList(List<String> places, int index1, int index2) {

		for (int index = index1; index < index2; index++) {
			System.out.print(places.get(index) + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		ListFromSubLists listFromSubLists = new ListFromSubLists();
		List<String> places = listFromSubLists.createList();
		listFromSubLists.displaySubList(places, 3, 8); // displaySubList() method is user-defined method

		List<String> subList = places.subList(3, 8); // subList() method is pre-defined method
		for (String place : subList) {
			System.out.print(place + " ");
		}

	}

}
