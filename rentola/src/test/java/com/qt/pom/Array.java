package com.qt.pom;

public class Array {
	
	public static void main(String[] args) {
		int[][] a= {{1,2},{1,2}};	
//		for (int[] is : a) 
//		{
//			for (int i : is) 
//			{
//				System.out.print(i);
//				System.out.print("  ");
//			}
//			System.out.println();
			
//		}
		int[][] b= {{1,2},{1,2}};
		int[][] c= new int[2][2];
		
		for( int i=0; i<2; i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]= a[i][j] * b[i][j];
				System.out.print(c[i][j]);
				System.out.print("   ");
			}
			System.out.println();
			
		}
	}
	
}


