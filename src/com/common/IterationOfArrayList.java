package com.common;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Program for iterating ArrayList
public class IterationOfArrayList {
	public static void main(String[] args) {
		
		//create an object of ArrayList
		List<Integer> list = new ArrayList<>();
		ListIterator<Integer> listIterator = null;
		
		//add values in ArrayList
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		//iterating data through forEach
		for(Integer i : list){
			System.out.println(""+i);
		}
		
	}
}
