package io.satya;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class IterateHashMapListSetCollection {

	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<>();
		
		hmap.put("A", 23);hmap.put("J", 18);hmap.put("Z", 28);hmap.put("Y", 21);hmap.put("K", 15);hmap.put("C", 03);

		// Method 1 to iterate through Hshmap.
		// convert map to keyset
		// add iterator to set and use hasnext and next method of iterator

		System.out.println("PRINTING BY SECOND WAY TROUGH MAP.ENTRY");
		Set<String> keySet = hmap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Integer value = hmap.get(key);

			System.out.println("Key is  " + key + " value is " + value);
		}
		
		// Alternate way of 1st method
		
		for(String str : keySet){
			System.out.println("key is  "+str+ "  and value is  "+hmap.get(str));
		}
		
		// Second method is by Map.Entry
		
		System.out.println("PRINTING BY SECOND WAY TROUGH MAP.ENTRY");
		Iterator<Map.Entry<String, Integer>> iterator2 = hmap.entrySet().iterator();
		while(iterator2.hasNext()){
			
			Map.Entry<String, Integer> entry = iterator2.next();
			
			System.out.println("key is  "+entry.getKey()+ "  and value is  "+entry.getValue());
			
		}
		
		// Alternate way of second method
		
		System.out.println("PRINTING BY ALTERNATE SECOND WAY TROUGH MAP.ENTRY");
		for(Map.Entry<String, Integer> entry3 : hmap.entrySet()){
			
			System.out.println("key is  "+entry3.getKey()+ "  and value is  "+entry3.getValue());
			
		}
		
		
		System.out.println("PRINTING BY THIRD WAY THROUGH STREAM");
		Stream.of(hmap).forEach(System.out::println);
		hmap.entrySet().stream().forEach(x -> System.out.println("Key is : "+x.getKey() + " value is " +x.getValue()));
		
		System.out.println("PRINTING BY FOURTH WAY FOR EACH JAVA 8");
		hmap.forEach((key,value)->{
			System.err.println(key);
			System.err.println(value);
		
		});

	}

}
