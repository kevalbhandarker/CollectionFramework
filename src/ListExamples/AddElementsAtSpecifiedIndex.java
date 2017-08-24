package ListExamples;

import java.util.ArrayList;

public class AddElementsAtSpecifiedIndex {
	public static void main(String[] args) {
		
		//create an object of ArrayList
		ArrayList arrayList = new ArrayList<>();
		
		//add the elements in the list
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		
		//Iterating Elements in the List
		for(int index=0 ; index<arrayList.size();index++){
			System.out.println(arrayList.get(index));
		}
		
		
	}
	
}
