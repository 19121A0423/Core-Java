package org.december5;

import java.util.Map;

import org.junit.Test;

public class TestClass {

	@Test
	public void iterateMapTest() {
		IterateMaps iterateMaps = new IterateMaps();

		Map persons = iterateMaps.createMap();
		iterateMaps.displayMap(persons);
//		iterateMaps.displayValues(persons);
	}
//
//	@Test
//	public void personMapTest() {
//		PersonMap personMapobj = new PersonMap();
//
//		Map persons1 = personMapobj.createPersonMap();
//		personMapobj.display(persons1);
//
//		Map persons2 = personMapobj.createHashTable();
//		personMapobj.display(persons2);
//	}
//
//	@Test
//	public void sortListTest() {
//
//		SortList sortList = new SortList();
//		sortList.sortListmethod();
//
//	}

//	@Test
//	public void sortMapTest() {
//		
//		MapsSort mapsSort = new MapsSort();
//		mapsSort.sortMaps();
//		
//	}

}
