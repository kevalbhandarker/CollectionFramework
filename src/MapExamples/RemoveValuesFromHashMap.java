package MapExamples;

import java.util.HashMap;

//Program for remove values from HashMap

public class RemoveValuesFromHashMap {
	public static void main(String[] args) {
		
		//Create new Object Of HashMAp
		HashMap<Integer,String> map = new HashMap<>();
		
		//add values in HashMap
		map.put(1, "keval");
		map.put(2, "satish");
		map.put(3, "bhandarker");
		
		//To Remove the values from HashMap use clear Method of HashMap
		map.clear();
		System.out.println("Size of HashMap is : "+map.size());
		
	}
}
