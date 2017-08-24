package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingComparable {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("chetan", 223, 26));
		list.add(new Student("rahul", 245, 24));
		list.add(new Student("ajit", 209, 32));
		
		Collections.sort(list);
		
		for(Student str : list){
			System.out.println(str);
		}
		
	}
}
