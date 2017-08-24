package MapExamples;

import java.util.HashMap;

//Program for Partivular Key exists in Java HashMap

public class CheckKeyOfHashMapExample {
	public static void main(String[] args) {
		
		//create object of hashmap
		HashMap map = new HashMap<>();

		//add key value pair to HashMap
		map.put("1", "Keval");
		map.put("2", "Nitesh");
		map.put("3", "Manan");
		
		
		//now check value of particular is exixst or not
		boolean isExists = map.containsKey("3");
		System.out.println("3 key exists : "+isExists);
		
		if(map.containsKey("1")){
			System.out.println("The HashMap Contains Key First");
		} else {
			System.out.println("The HashMap does not contains Key First");
		}
		
		if(map.containsKey("5")){
			System.out.println("The HashMap contains Key Fifth");
		} else {
			System.out.println("The HashMap does not contains key fifth");
		}
		
		checkKeyHashMap();
		
	}
	
	
	private static void checkKeyHashMap(){
		
		//create object of 
		HashMap<Integer, String> map = new HashMap<>();
		
		//add the values in HashMap
		map.put(1, "keval");
		map.put(2, "nitesh");
		map.put(3, "manan");
		
		
		boolean isExists = map.containsKey(4);
		System.out.println("Key Exists : "+isExists);
		
		
		
	}
}
