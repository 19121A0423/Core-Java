package org.december11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class CheckWordInList {
	
	public boolean checkString(List<String> list,String string)
	{
		for(String element:list) {
			if(element.equals(string)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		CheckWordInList checkWordInList = new CheckWordInList();
		
		//using lambda expressions
		BiFunction <List<String>,String,Boolean> biFunction = (stringList , string)->{
			return stringList.contains(string);
		};
		
		List<String> places = new ArrayList<String>();
		places.add("Kadapa");
		places.add("Kurnool");
		places.add("Tirupati");
		places.add("Ananthapur");
		places.add("Nellore");
		
		System.out.println(biFunction.apply(places, "Kapa"));
		
		//using method reference
		BiFunction <List<String>,String,Boolean> biFunction2=checkWordInList::checkString;
		System.out.println(biFunction2.apply(places, "Nellore"));
		
	}

}
