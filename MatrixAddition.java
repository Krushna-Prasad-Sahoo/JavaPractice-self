package com.java.practice.ControlFlow;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int r = sc.nextInt();
		
		System.out.println("Enter the number of columns : ");
		int c = sc.nextInt();
		
		int x[][] = new int[r][c];
		int y[][] = new int[r][c];
		int z[][] = new int[r][c];
//-----------------------------------------------------------------------------------		
		System.out.println("First enter the value for matrix X ...");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.println("Enter the value at index " + i + j);
				x[i][j] = sc.nextInt();
			}
		}
//-------------------------------------------------------------------------------------		
		System.out.println("Then enter the value for matrix Y ...");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.println("Enter the value at index " + i + j);
				y[i][j] = sc.nextInt();
			}
		}
//---------------------------------------------------------------------------------------
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
//-------------------------------------------------------------------------
		System.out.println("Now let's see the result : ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.print(z[i][j] + " - ");
			}
			System.out.println();
		}
	}

}
