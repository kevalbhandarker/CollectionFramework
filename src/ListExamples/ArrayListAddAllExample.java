package ListExamples;

import java.util.ArrayList;
import java.util.List;

//Program for addAll method of arrayList
public class ArrayListAddAllExample {
	public static void main(String[] args) {
		
		//create an object of ArrayList
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("keval");
		arrayList.add("satish");
		arrayList.add("bhandarker");
		
		//original Elements
		System.out.println("Original Data : "+arrayList);
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		
		arrayList.addAll(list);
		System.out.println(""+arrayList);
		
		//delete all elements from the list
		arrayList.clear();
		System.out.println("delete the list : "+arrayList);
	}
}
