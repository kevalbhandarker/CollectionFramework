package MapExamples;

import java.util.HashMap;

//Program for Partivular Vaalue exists in Java HashMap

public class CheckValueOfHashMap {
	public static void main(String[] args) {
		
		//create object of HashMap
		HashMap<Integer, String> map = new HashMap<>();
		
		//add values in Map
		map.put(1, "keval");
		map.put(2, "nitesh");
		map.put(3, "test");
		
		//check if value is Exixst in HashMap
		boolean isExists = map.containsValue("keval");
		System.out.println("Values Exists : "+isExists);
		
	}
}
