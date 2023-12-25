package org.november29;

import java.util.ArrayList;
import java.util.List;


public class Generics<E> {
	
	List<E> elements = new ArrayList<E>();
	
//	E elements[] = new E[10];	//Cannot create a generic array of E
	
	
	public void addElement(E element) {
		elements.add(element);
	}
	
	public void deleteElement(int index) {
		elements.remove(index);
	}
	
	public void display()
	{
		
		System.out.println("-------number of elements: "+elements.size()+" -------");
		
		for(Object element : elements ) {
			System.out.println(element);
		}
		
		System.out.println();
		listDisplay(elements);
		
//		for(int index=0;index<elements.size();index++) {
//			System.out.println(elements.get(index));
//		}
	}
	
	public void listDisplay(List<E> elements2) {
		for (Object ele:elements2) {
			System.out.println(ele);
		}
	}
	
	
	public static void main(String[] args) {
//		Object[] array = new Object[5];
//		array[0]="fvgbhjkjhg";
//		array[1]=567;
//		array[2]=5678.876;
//		array[3]=true;
//		array[4]='v';
//		for(int index=0;index<array.length;index++) {
//			System.out.println(array[index]);
//		}
		
		Integer i = new Integer(9);
		Short b = (short) i.intValue();
		System.out.println(b);
		
		
		
		
		
	}

}
