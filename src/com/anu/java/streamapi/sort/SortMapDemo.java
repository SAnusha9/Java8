package com.anu.java.streamapi.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map. put("Four", 4);
		
		/*
		 * List<Entry<String, Integer>> entries= new ArrayList<>(map.entrySet());
		 * Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
		 * for(Entry<String, Integer> entry : entries) {
		 * System.out.println(entry.getKey()+ " "+ entry.getValue()); }
		 */
			map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
	}

}
