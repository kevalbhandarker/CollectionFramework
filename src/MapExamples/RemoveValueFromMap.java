package MapExamples;

import java.util.HashMap;

//Program for remove value from HashMap
public class RemoveValueFromMap {
	public static void main(String[] args) {
		
		//create an object of HashMap
		HashMap<Integer, String> map = new HashMap<>();
		
		
		//add values in Map
		map.put(1, "keval");
		map.put(2, "satish");
		map.put(3, "bhandarker");
		
		
		//Now remove the value from HashMap
		Object obj = map.remove(2);
		System.out.println("Remove From HashMap : "+obj);
		
	}
}
