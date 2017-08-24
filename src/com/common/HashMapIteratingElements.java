package com.common;

import java.util.HashMap;import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteratingElements {
	public static void main(String[] args) {
		
		//create an object of HashMap 
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "January");
		map.put("2", "Feb");
		map.put("3", "March");
		map.put("4", "April");
		map.put("5", "May");
		map.put("6", "June");
		map.put("7", "July");
		map.put("8", "August");
		
		
		//iterate the map through for loop
		for(Entry<String, String> entryMap : map.entrySet()){
			String key = entryMap.getKey();
			String value = entryMap.getValue();
			System.out.println(key);
			System.out.println(value);
		}
	}
}
