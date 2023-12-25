package org.december6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountWordsUsingMap {
	
	public void countWords() {
		
		String sentence="Core nuts technologies located in Bangalore Core nuts "
				+ "technologies located in hyderabad Core nuts technologies in Hyderabad "
				+ "Core nuts technologies in Bangalore";
		String[] words = sentence.split(" ");
		Map<String,Integer> wordsMap = new LinkedHashMap<String,Integer>();
		int count=0;
		for(String word:words) {
			if(wordsMap.containsKey(word)) {
				count = wordsMap.get(word);
				count++;
				wordsMap.put(word,count);
			}
			else {
				wordsMap.put(word,1);
			}
		}
		
		for(Entry<String,Integer> entry:wordsMap.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		CountWordsUsingMap countWordsUsingMap = new CountWordsUsingMap();
		countWordsUsingMap.countWords();
		System.out.println();
	}

}
