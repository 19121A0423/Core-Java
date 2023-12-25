package org.december5;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {
	
	public void displayMaps(Map<Integer,String> map) {
		
		for (String value : map.values()) {
			System.out.println(value);
		}		
	}
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(4, "Banana");
		map.put(6, "Grapes");
		map.put(3, "PineApple");
		
		IterateMap iterateMap = new IterateMap();
		iterateMap.displayMaps(map);
		
	}

}
