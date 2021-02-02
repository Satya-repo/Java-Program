package io.satya;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompression {

	public static void main(String[] args) {
		String str = "aaabccc";// a3b1c3

		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (hmap.containsKey(charArray[i])) {

				Character key = charArray[i];
				Integer value = hmap.get(key);
				hmap.put(key, ++value);
			} else {

				hmap.put(charArray[i], 1);

			}
		}

		Iterator<Entry<Character, Integer>> iterator = hmap.entrySet().iterator();

		while (iterator.hasNext()) {

			Map.Entry<Character, Integer> entry = iterator.next();
			System.out.print(entry.getKey() + "" + entry.getValue());

		}
		
		
		
		

	}

}
