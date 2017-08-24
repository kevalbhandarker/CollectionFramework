package com.common;

import java.util.HashSet;
import java.util.Iterator;

public class BasicHashSetOperations {
	public static void main(String[] args) {
		
		//create an object of HashSet
		HashSet<String> set = new HashSet<>();
		
		//add data to HashSet
		set.add("keval");
		set.add("satish");
		set.add("bhandarker");
		
		//original data in HashSet
		System.out.println("Original Data are in HashSet"+set);
		
		//Is HashSet Empty
		System.out.println("Is HashSet Empty : "+set.isEmpty());
		
		//Size of HashSet
		System.out.println("Size of HashSet : "+set.size());
		System.out.println("Is HashSet contains keval "+set.contains("keval"));
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		
		
		
	}
}
