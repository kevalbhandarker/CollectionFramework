package ListExamples;

import java.util.ArrayList;

//Basic ArrayList Examples
public class BasicArrayListExamples {
	public static void main(String[] args) {
		
		//create an object of ArrayList
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("JAVA");
		arrayList.add("C");
		arrayList.add("C++");
		arrayList.add("PHP");
		
		//now arraylist elements
		System.out.println("Elements of array"+arrayList);
		
		//get elements by index
		System.out.println("First Element is : "+arrayList.get(0));
		System.out.println("Second Element is : "+arrayList.get(1));
		System.out.println("Third Element is : "+arrayList.get(2));
		System.out.println("Fourth Element is : "+arrayList.get(3));
		
		//Check List contains JAVA
		System.out.println("Does list contains JAVA : "+arrayList.contains("JAVA"));
	
		//add elements at specific index
		arrayList.add(2, "Perl");
		System.out.println(arrayList);
		
		//Check ArrayList Empty or not
		System.out.println("is empty ArrayList : "+arrayList.isEmpty());
		System.out.println("Index of JAVA is : "+arrayList.indexOf("JAVA"));
		System.out.println("Size of ArrayList is : "+arrayList.size());
		
	}
}
