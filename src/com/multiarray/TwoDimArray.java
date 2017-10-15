package com.multiarray;

public class TwoDimArray {
	public static void main(String[] args) {
		//Array of size 4 by 3 to hold integer array
		int[][] values = {{10,20,30}, {40,50,60}, {70,80,90}, {11,21,31}};
		
		//Nested loop to print the array in tabular form
		for (int row=0; row<4 ; row++){
			for(int col=0 ; col<3 ; col++){
				System.out.print(values[row][col] + " ");
			}
			System.out.println();
		}
	}
}
