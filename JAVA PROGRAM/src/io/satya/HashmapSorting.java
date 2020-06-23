package io.satya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashmapSorting {

	public static void main(String[] args) {

		System.out.println("NOW KEY SORTING WILL BE DONE");
		HashMap<String, Integer> hmap = new HashMap<>();

		hmap.put("A", 23);
		hmap.put("J", 18);
		hmap.put("Z", 28);
		hmap.put("Y", 21);
		hmap.put("K", 15);
		hmap.put("C", 03);

		// 1st way is TreeMap
		System.out.println(hmap);
		System.out.println(new TreeMap<String, Integer>(hmap));

		// 2nd Way is adding to list
		List<String> list = new ArrayList<>(hmap.keySet());
		Collections.sort(list);
		System.out.println(list);

		// 3rd way using Treeset

		Set<String> treeset = new TreeSet<String>(hmap.keySet());
		System.out.println(treeset);

		// 4th Using Stream API

		hmap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey())
		.forEach(System.out::println);

		System.out.println("NOW VALUE SORTING WILL BE DONE");

		// 1st method through Stream API
		hmap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
		.forEach(System.out::println);

		// 2nd method

		Set<Integer> sortedSet = new TreeSet<Integer>(hmap.values());
		System.out.println(sortedSet);

		// 3rd Method

		List<Integer> sortedValueList = new ArrayList<>(hmap.values());
		Collections.sort(sortedValueList);
		System.out.println(sortedValueList);
		
		CustomSortingHashmap cs  = new CustomSortingHashmap();
		cs.m1();

	}

}

class CustomSortingHashmap {

	public void m1(){
	
	HashMap<Integer, String> hm = new HashMap<Integer, String>();  
	hm.put(6, "Tushar");  
	hm.put(12, "Ashu");  
	hm.put(5, "Zoya");  
	hm.put(78, "Yash");  
	hm.put(10, "Praveen");  
	hm.put(67, "Boby");  
	hm.put(1, "Ritesh");  
	
	/*LinkedList<Map.Entry<Integer, String>> linkedList = new LinkedList<Map.Entry<Integer,String>>(hm.entrySet());
	Collections.sort(linkedList,new Comparator<Map.Entry<Integer, String>>() {

		@Override
		public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
			return (o1.getValue()).compareTo(o2.getValue());
		}
	});
	
	HashMap<Integer, String> hm2 = new LinkedHashMap<>();
	for(Map.Entry<Integer, String> aa : linkedList){
		hm2.put(aa.getKey(), aa.getValue());
		
	}
	System.out.println(hm);
	System.out.println(hm2);*/
	
	LinkedList<Map.Entry<Integer, String>> linkedList = new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());
	Collections.sort(linkedList,new Comparator<Map.Entry<Integer,String>>() {

		@Override
		public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
			return (o1.getValue()).compareTo(o2.getValue());
		}
	});
	
	LinkedHashMap<Integer, String> hm2 = new LinkedHashMap<>();
	for(Map.Entry<Integer, String> entry: linkedList){
		hm2.put(entry.getKey(), entry.getValue());
	}
	System.out.println(hm);
	System.out.println(hm2);
	
	hm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue()).forEach
	(System.out::println);
	
	
	
	}
	
}
