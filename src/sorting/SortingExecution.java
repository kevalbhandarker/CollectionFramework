package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingExecution {
	public static void main(String[] args) {
		
		List<Car> carList = new ArrayList<>();

		for(int i=0;i<100;i++){
			Car car = new Car("Registration : "+i);
			car.setPrice((int)(Math.random()*100)+1);
			carList.add(car);
		}
		
		Iterator<Car> carIterator = carList.iterator();
		while(carIterator.hasNext()){
			Car car = carIterator.next();
			System.out.println(car +"Price : "+car.getPrice());
		}
		
		Collections.sort(carList);
		System.out.println("After Sorting......");
		
		//Sorting by Ascending order
		Iterator<Car> sortingList = carList.iterator();
		while(sortingList.hasNext()){
			Car car = sortingList.next();
			System.out.println(car +"Sorting Price is : "+car.getPrice());
		}
		
		//Code for customComparator
		System.out.println("Custom Comparision");
		Collections.sort(carList, new CustomComparator());
		
		Iterator<Car> customIterator = carList.iterator();
		while(customIterator.hasNext()){
			Car c = customIterator.next();
			System.out.println(c +"Price : "+c.getPrice());
		}
	}
}
