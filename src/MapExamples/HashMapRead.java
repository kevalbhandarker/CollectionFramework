package MapExamples;

import java.util.HashMap;
import java.util.Set;

//Program for iterate through keySet in HashMap
public class HashMapRead {
	public static void main(String[] args) {
		
		//create an object of HashMap
		HashMap<String, String> map = new HashMap<>();
		
		//add the key value data in Map
		map.put("first", "keval");
		map.put("second", "satish");
		map.put("third", "bhandarker");
		
		//Iterate Map Through keySet
		Set<String> keys = map.keySet();
		for(String key : keys){
			System.out.println("Value of "+key+" is "+map.get(key));
			
			//Now get All Key
			System.out.println(key);
		}
		
	}
}
