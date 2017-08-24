package MapExamples;

import java.util.HashMap;

public class GetValueFromMap {
	public static void main(String[] args) {
		
		//create an object of Map.
		HashMap map = new HashMap<>();
		
		//add value in Map
		map.put("one", new Integer(1));
		map.put("Two", new Integer(2));
		
		
		
		Object obj = map.get("one");
		System.out.println("Value is : "+obj);
		
	}
}
