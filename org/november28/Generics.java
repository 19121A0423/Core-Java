package org.november28;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	public void program1() {
		List list1=new ArrayList();
		list1.add("Raji");
		list1.add(100);
		list1.add('c');
		list1.add(64876.87f);
		list1.add(true);
		
		
		List<String> list2=new ArrayList<String>();
		list2.add("Corenuts");
//		list2.add(199);	//The method add(int, String) in the type List<String> is not applicable for the arguments (int)
		list2.add("technology");
		list2.add("feuji");
		
		for(Object ele:list1) {
//			String e=(String)ele;	//java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
			System.out.println(ele);
		}
		System.out.println();
		
		for(String ele:list2) {
			System.out.println(ele);
		}
		
	}
	

}
