package com.java.practice.sorting;

public class BubbleSort {
	public static void main(String[] args) {

//how it works : get the 1st & 2nd element, then check & move the larger one to right side. Keep'n doing
//this. In the 1st iteration the max num will be at right of array. Continue till all gets sorted. 
		
		int arr[] = { -1, 0, -2, 78, 1, 2 , -10}; // int arr[] = { 5, -9, 1, 4, 56, 22, 9 };
		int arr_len = arr.length;

		for (int j = 0; j < arr_len - 1; j++) {
			for (int i = 0; i < arr_len - 1; i++) {
				if (arr[i + 1] < arr[i]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int item : arr) {
			System.out.print(item + "  ");
		}

	}

}
