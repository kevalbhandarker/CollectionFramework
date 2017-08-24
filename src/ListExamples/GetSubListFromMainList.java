package ListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetSubListFromMainList {
	public static void main(String[] args) {
		
		//create one object
		ArrayList<String> al = new ArrayList<>();
		
		//add elements into list
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		al.add("fifth");
		
		//Reverse the List
		Collections.reverse(al);
		for(String str : al){
			System.out.println(str);
		}

		System.out.println("Actual Arralist : "+al);
		List<String> list = al.subList(2, 4);
		System.out.println("Sub List is : "+list);
	}
}
