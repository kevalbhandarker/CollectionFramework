package com.common;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		
		//create an object of List
		List<Integer> list = new ArrayList<>();
		//ListIterator<Integer> listIterator = null;
		
		//adding values in ArrayList
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		ListIterator<Integer> listIteartor = list.listIterator();
		
		//iterating elements in forward direction
		while(listIteartor.hasNext()){
			System.out.println(listIteartor.next());
		}
		
		//itearting elements in Backward direction
		while(listIteartor.hasPrevious()){
			System.out.println(listIteartor.previous());
		}
		
		
	}
}
