package hashcodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Execution {
	public static void main(String[] args) {
		
		Student s = new Student("H123");
		Student s2 = new Student("H123");
		
		if(s.equals(s2)){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		Map<Student, ReportCard> map = new HashMap<>();
		map.put(s, new ReportCard());
		map.put(s2, new ReportCard());
		
		System.out.println(map.size());
		
		Set<Student> studentSet = new HashSet<>();
		for(int i=0;i<100;i++){
			studentSet.add(new Student("H : "+i));
		}
		System.out.println(studentSet.size());
		
		long startTime = System.nanoTime();
		System.out.println(studentSet.contains(new Student("H4")));
		System.out.println("Elapsed Time : "+(System.nanoTime()-startTime));
		
		Student s4 = new Student("H123");
		System.out.println(s.equals(s));
		System.out.println(s.equals(s2)+ "" +s2.equals(s));
		System.out.println(s.equals(s4)+ "" +s2.equals(s4) + "" +s4.equals(s));
		System.out.println(s.equals(null));
		
	}
}
