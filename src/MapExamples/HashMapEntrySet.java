package MapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Program for get Entry Set from Map
public class HashMapEntrySet {
	public static void main(String[] args) {
		
		//create new object from Map
		HashMap<String, String> map = new HashMap<>();
		
		//add key value pair
		map.put("first", "keval");
		map.put("second", "satish");
		map.put("third", "bhandarker");
		
		//Apply Entry in HashMap
		Set<Map.Entry<String,String>> entries = map.entrySet();
		for(Entry<String, String> entry : entries){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
