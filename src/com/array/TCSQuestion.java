package com.array;

public class TCSQuestion {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(111, "keval");
		Employee e2 = new Employee(222, "satish");
		Employee e3 = new Employee(333, "bhandarker");
		
		Employee[] e = new Employee[5];
		e[0] = e1;
		e[2] = e2;
		e[4] = e3;
		
//		for(Employee ee : e){
//			System.out.println(ee.eid+ "----" +ee.ename);
//		}
		
//		for(Object o : e){
//			if(o instanceof Employee){
//				Employee ee = (Employee)o;
//				System.out.println(ee.eid+"---"+ee.ename);
//			}
//			if(o == null){
//				System.out.println(o);
//			}
//		}
		
		
		for(int i=0;i<e.length;i++){
			if(e[i] == null){
				System.out.println(i);
			}
		}
		}
}
