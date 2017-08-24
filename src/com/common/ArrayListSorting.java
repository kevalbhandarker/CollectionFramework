package com.common;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main(String[] args) {
		
		//create an object of ArrayList
		ArrayList<String> list = new ArrayList<>();
		
		//add data in the ArrayList
		list.add("David");
		list.add("Venish");
		list.add("Test");
		list.add("Xenon");
		
		//Original List is 
		System.out.println("Unsorted  List is : "+list);
		
		//sort the elemnts via Collections.sort() method
		Collections.sort(list);
		System.out.println("Sorted List is : "+list);
		
		
			
	}
}
