package com.common;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		
		//create an Object of TreeMap
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(22, "keval");
		treeMap.put(1, "satish");
		treeMap.put(3, "surname");
		treeMap.put(50, "test");
		
		//show the TreeMap
		System.out.println(""+treeMap);
		
	}
}
