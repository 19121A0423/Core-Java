package org.november24;

import org.junit.Test;

public class TestClass {

	@Test
	public void stringTest() {
		StringsPractice stringObj=new StringsPractice();
		stringObj.stringToArray("Corenuts Technologies");
		System.out.println();
		
		stringObj.stringMethods("Corenuts Technologies private limited");
		System.out.println();
		
		stringObj.stringComparision();
		System.out.println();
		
		stringObj.stringReverse("Corenuts Technologies");
		System.out.println();
		
		stringObj.wordsReverse("Corenuts Technologies private limited");
		System.out.println();
		
		stringObj.modifyString();
		System.out.println();
		
		stringObj.tokenizedString();
		System.out.println();
		
		stringObj.countCharacters("Corenuts Techonology");
		System.out.println();
		
	}
	
	
	
}
