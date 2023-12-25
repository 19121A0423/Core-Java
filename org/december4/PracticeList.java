package org.december4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PracticeList {
	
	public void method1() {
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
//		list.set(10, 50);
//		System.out.println(list);
//		list.add(10,90);
//		System.out.println(list);
		
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add('k');
		list1.add(true);
		System.out.println(list1);
		Integer result=0;
		for(Object element : list1) {
			if(element instanceof Number) {
				result =  Integer.sum(result, (Integer) element);
			}
			
		}
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		PracticeList obj=new PracticeList();
		obj.method1();
		
	}
	

}
