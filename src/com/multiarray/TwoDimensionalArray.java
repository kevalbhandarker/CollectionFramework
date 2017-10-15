package com.multiarray;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
		int row, col, i, j;
		int arr[][] = new int[10][10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of row for 2D Array");
		row = scanner.nextInt();
		System.out.println("Enter the number of column for 2D Array");
		col = scanner.nextInt();
		
		System.out.println("Enter " +(row*col)+ " element of array");
		for(i=0; i<row; i++){
			for(j=0; j<col; j++){
				arr[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("The Array is : \n");
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
