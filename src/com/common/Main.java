package com.common;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("Test", 8.6, 1980));
		list.add(new Movie("Abc", 8.8, 2000));
		list.add(new Movie("Xyz", 5.0, 1970));
		list.add(new Movie("Def", 5.7, 1990));
		
		Collections.sort(list);
		
		for(Movie m : list){
			System.out.println(m.getName()+ "" +m.getRating()+ " " +m.getYear());
		}
		
	}
}
