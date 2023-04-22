package java_programming_for_beginners;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapRunner {
	public static void main(String[] args) {
		String str = "This is an awesome ocassion. This has never happened before.";
		
		//count each character
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		char[] character = str.toCharArray();

		for (int i=0;i<character.length;++i) {
			Integer integer=count.get(character[i]);
			if(integer==null) {
				count.put(character[i], 1);
			}
			else {
				count.put(character[i], integer+1);
			}
		}
		System.out.println(count);
		
		//count each word
		Map<String, Integer> stringCount = new HashMap<String, Integer>();
		String[] words=str.split(" ");
		for (int i=0;i<words.length;++i) {
			Integer integer=stringCount.get(words[i]);
			if(integer==null) {
				stringCount.put(words[i], 1);
			}
			else {
				stringCount.put(words[i], integer+1);
			}
		}
		System.out.println(stringCount);
	}
}
