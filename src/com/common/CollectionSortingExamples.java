package com.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Program for Collection Sorting
public class CollectionSortingExamples {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//Original list is :
		System.out.println("Original List is : "+list);
		
		//Now sorted in ascending order
		Collections.sort(list);
		
		//print the list value in Ascending order
		System.out.println("Sorted List are : "+list);
		
		//Now its in reverse or descending order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Descending order list are : "+list);
		
	}
}
