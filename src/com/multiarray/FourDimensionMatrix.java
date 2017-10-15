package com.multiarray;

public class FourDimensionMatrix {
	public static void main(String[] args) {
		
		int fourDim[][][][] = new int[3][4][5][6];
		int	i,j,k,l;
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				for(k=0; k<5; k++){
					for(l=0; l<6; l++){
						fourDim[i][j][k][l] = i*j*k*l;
					}
					
				}
			}
		}
		
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				for(k=0; k<5; k++){
					for(l=0; l<6; l++){
						System.out.print(fourDim[i][j][k][l] + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
