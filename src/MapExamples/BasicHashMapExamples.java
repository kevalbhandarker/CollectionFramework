package MapExamples;

import java.util.HashMap;

//Program for basic hashMap Operation 
public class BasicHashMapExamples {
	public static void main(String[] args) {
		
		//create an object of HashMap
		HashMap<String, String> map = new HashMap<>();
		
		//add values in HashMap
		map.put("first", "keval");
		map.put("second", "satish");
		map.put("third", "bhandarker");
		
		//Get Whole Map With the contents
		System.out.println("Whole Map contents data : "+map);
		
		//getting particular key with data
		System.out.println("Value of second : "+map.get("second"));
		
		//Size of Map is 
		System.out.println(map.size());
		
		//Check Map is Empty or Not
		System.out.println("Is HashMap Empty ? "+map.isEmpty());
		
		
		//Now remove the third element
		map.remove("third");
		
		//Now the Elemements of the Map
		System.out.println("Elements of the Map is : "+map);
		
		//Now Size of the Map
		System.out.println("Size is : "+map.size());
	}
}
