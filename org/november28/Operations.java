package org.november28;

import java.util.ArrayList;
import java.util.List;

public class Operations {

	public <T extends Number> void display(T value1, T value2) {
		System.out.println("Value1 : " + value1);
		System.out.println("Value2 : " + value2);

	}

	public void list() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(8765);
		list.add(3456);
		list.add(123);
		listDisplay(list);
		
		List<Number> list1 = new ArrayList<Number>();
		list.add(8765);
		list.add(3456);
		list.add(123);
		listDisplay1(list1);

	}

	public void listDisplay(List<? extends Number> list) {
		for (Number ele:list) {
			System.out.println(ele);
		}
	}
	
	public void listDisplay1(List<? super Integer> list) {
		for (Object ele:list) {
			System.out.println(ele);
		}
	}

}
