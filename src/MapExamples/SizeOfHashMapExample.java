package MapExamples;

import java.util.HashMap;

public class SizeOfHashMapExample {
	public static void main(String[] args) {
		
		//create object of HashMap
		HashMap map = new HashMap<>();
	
		//This is an Empty MAP for that size is 0
		System.out.println("Size of Empty Map is : "+map.size());
	
		
		//add key value pair to HashMap
		map.put("1", "keval");
		map.put("2", "satish");
		map.put("3", "bhandarker");
		
		//Now this map having 3 data and its size is 
		System.out.println(map.size());
		
		//Now i removing one element from map
		map.remove("3");
		
		//Now Again Check the Size of Map is
		System.out.println("After removing element size is : "+map.size());
		
	}
}
