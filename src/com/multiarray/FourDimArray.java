package com.multiarray;

public class FourDimArray {
	public static void main(String[] args) {
		int arr[][][][] = new int[3][4][2][2];
		int i,j,k,l,num=1;
		
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				for(k=0 ; k<2; k++){
					for(l=0; l<2; l++){
						arr[i][j][k][l] = num;
						num++;
					}
				}
			}
		}
		
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				for(k=0; k<2; k++){
					for(l=0; l<2; l++){
						System.out.print("arr[" +i+ "][" +j+ "][" +k+ "][" +l+ "] = " +arr[i][j][k][l]+ "\t");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
