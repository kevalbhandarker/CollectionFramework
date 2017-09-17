package com.array;

public class LinearSearch {
	public static void main(String[] args) {
		
		int[] numbers = {2,3,5,8,0,4,9};
		int target = 0;
		
		//finding linear search 
		for (int i=0;i<numbers.length;i++){
			if(numbers[i] == target){
				System.out.println("Element found at index : "+ i);
				break;
			}
		}
	}
}
