package MapExamples;

import java.util.HashMap;

//Program for copy HashMap contents into another Map

public class HashMapCopyContents {
	public static void main(String[] args) {
		
		//ceate an object of HashMap
		HashMap<String, String> map = new HashMap<>();
		
		// add key value pair in Map
		map.put("first", "keval");
		map.put("second", "satish");
		map.put("third", "bhandarket");
	
		//Now total elements of this Map
		System.out.println("Map content is : "+map);
		
		//creating another Map Object
		HashMap<String, String> subMap = new HashMap<>();
		subMap.put("T1", "T1 Value");
		subMap.put("T2", "T2 Value");
		
		//Now sub map data put in parent Map
		map.putAll(subMap);
		System.out.println(map);
		
		
	}
}
