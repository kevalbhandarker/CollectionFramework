package com.common;

import java.util.ArrayList;

//Program for Searching Element in ArrayList
public class ArrayListSearchingExample {
	public static void main(String[] args) {
		
		//Create an object of ArrayList
		ArrayList<String> list = new ArrayList<>();
		
		//add the Elemnets
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("1");
		list.add("2");
		
		boolean isAvailable = list.contains("2");
		System.out.println("ArrayList contains 2 : "+isAvailable);
		
		int index = list.indexOf("4");
		System.out.println("Index is : "+index);
		
		if(index == -1){
			System.out.println("ArraList does not contain 4");
		} else {
			System.out.println("ArrayList contains 4 at index of : "+index);
		}
		
		int lastIndex = list.lastIndexOf("2");
		System.out.println("Last Index is : "+lastIndex);
		
		if(lastIndex == -1){
			System.out.println("ArrayList does not contain 2");
		} else {
			System.out.println("ArrayList contains 2 at index of : "+lastIndex);
		}
		
	}
}
