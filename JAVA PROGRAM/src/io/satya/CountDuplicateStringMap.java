package io.satya;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

public class CountDuplicateStringMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<>();
		Integer i =1;
		String str = "satya is satya boy and tanima is a tanima girl";
		String[] array = str.split(" ");
		for(String str1 : array){
			if(!hmap.containsKey(str1)){
				hmap.put(str1, i);
			}else{
				hmap.put(str1, i++);
			}
		}
		
		/*Set<String> keySet = hmap.keySet();
		for(String map:keySet){
			System.out.println(map+ "  "+ hmap.get(map));
		}*/
		
	/*	hmap.forEach((key,value) -> {
		
				System.out.print(key+ " ");
				System.out.print(value);
				System.out.println();
		
		});*/
		
		/*Set<Map.Entry<String, Integer>> entrySet = hmap.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet){
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}*/
		
	 /* Iterator<Map.Entry<String, Integer>> iterator = hmap.entrySet().iterator();
	  while(iterator.hasNext()){
		  
		Map.Entry<String, Integer> entry = iterator.next();
		System.out.println(entry.getKey() + entry.getValue());
		  
	  }*/
		
		/*hmap.forEach((key,value) ->{
		System.out.println(key);
		System.out.println(value);
		
		});*/
		
		
		
	}

}
