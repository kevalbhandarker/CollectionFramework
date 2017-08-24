package ListExamples;

import java.util.ArrayList;

//Program for copy elements into another ArrayList
public class CopyOfArrayList {
	public static void main(String[] args) {
		
		//create an object of ArrayList
		ArrayList<String> arrayList = new ArrayList<>();
		
		//add values in ArrayList
		arrayList.add("first");
		arrayList.add("second");
		arrayList.add("third");
		
		System.out.println("Original ArrayList is : "+arrayList);
		ArrayList<String> copy = (ArrayList<String>) arrayList.clone();
		System.out.println("Cloned ArrayList is : "+copy);
		
	}
}
