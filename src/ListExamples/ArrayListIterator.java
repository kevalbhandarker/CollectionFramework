package ListExamples;

import java.util.ArrayList;
import java.util.Iterator;

//Read all Elements of Iterator
public class ArrayListIterator {
	public static void main(String[] args) {
		
		//create an object of ArrayList
		ArrayList<String> list = new ArrayList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		
		//Now iterate the elements
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}
