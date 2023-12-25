package org.november24;

import java.util.StringTokenizer;

public class StringsPractice {
	
	//program1
	public void stringToArray(String name) {
		char[] nameArray = name.toCharArray();
		System.out.println(nameArray);
		
		char [] nameArray1 = new char[name.length()];
		for(int index=0;index<name.length();index++) {
			nameArray1[index] = name.charAt(index);
		}
		
		for(int index=0;index<nameArray.length;index++) {
			System.out.print(nameArray1[index]+" ");
		}
		System.out.println();
		
	}
	
	//program2
	public void stringMethods(String value) {
		int tempindex=value.indexOf(" ");
		int index=value.indexOf(" ",tempindex+1);
		
		System.out.println("String length : "+value.length());
		System.out.println("String in uppercase : "+value.toUpperCase());
		System.out.println("String in uppercase : "+value.toLowerCase());
		System.out.println("Substring method :"+value.substring(0,index));
		System.out.println("Substring method with one parameter : "+value.substring(value.indexOf(" ")+1));
	}
	
	
	//program3 and program4
	public void stringComparision() {
		String name1="Raji";
		String name2="Raji";
		String name3=new String("Raji");
		String name4=new String("Raji");
		String name5=new String("Geetha");
		
		System.out.println("== operator");
		System.out.println(name1==name2);
		System.out.println(name3==name4);
		System.out.println(name1==name3);
		
		System.out.println("----------equals method----------");
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name3.equals(name4));
		System.out.println(name3.equals(name5));
	}
	
	//program5 
	public void stringReverse(String name) {
		String reverse1=new String();
		for(int index=0;index<name.length();index++) {
			reverse1=name.charAt(index)+reverse1;
		}
		
		String reverse2=new String();
		for(int index=name.length()-1;index>=0;index--) {
			reverse2=reverse2+name.charAt(index);
		}
		
		System.out.println("Reverse string");
		System.out.println(reverse1);
		System.out.println(reverse2);
	
	}
	
	
	//program6
	public void wordsReverse(String name) {
		
		System.out.println("Reverse the words in a string");
		String[] stringArray = name.split(" ");
		for(int index=stringArray.length-1;index>=0;index--) {
			System.out.println(stringArray[index]);
		}
		
		int noOfWords=0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)==' ') {
				noOfWords++;
			}
		}
		
//		System.out.println();
		String[] stringArray1 = new String[noOfWords+1];
		String temp="";

		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)!=' ') {
				temp=temp+name.charAt(index);
			}
			else {
//				System.out.println(temp+" "+noOfWords);
				stringArray1[noOfWords]=temp;
				temp="";
				noOfWords--;
			}
		}
		stringArray1[noOfWords]=temp;
		
		System.out.println();
		for(int index=0;index<stringArray1.length;index++) {
			System.out.println(stringArray1[index]);
		}
		
	}
	
	//program7
	public void tokenizedString() {
		StringTokenizer token1=new StringTokenizer("Corenuts Technology private limited"," ");
		while(token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
		
		StringTokenizer token2=new StringTokenizer("Corenuts:Technology:private:limited",":");
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
	}
	
	//program8 and program9
	public void modifyString() {
		StringBuffer name=new StringBuffer("Corenuts Technology private limited");
		int index1=name.indexOf(" ");
		int index2=name.indexOf(" ",index1+1);
		String temp = name.substring(index1,index2);
		name=name.delete(index1,index2);
		System.out.println(name);
		
		name.insert(index1,temp);
		System.out.println(name);
		
	}
	
	public void countCharacters(String name) {
		
		for(int index1=0;index1<name.length();index1++) {
			int count=0;
			for(int index2=index1;index2<name.length();index2++) {
				if(name.charAt(index1)==name.charAt(index2)) {
					count++;
				}
			}
			System.out.println(name.charAt(index1)+" : "+count);
		}
		
	}
	
	
}
