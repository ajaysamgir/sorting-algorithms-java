package com.ajaysamgir.sorting.examples;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 7, 2, 8, 3, 9, 4, 5 };
		int iLoopCount = 0;
		int jLoopCount = 0;
		int block;
		int value;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 1; i < arr.length; i++) {
			iLoopCount++;
			block = i;
			value = arr[i];

			while(block > 0 && arr[block - 1] > value) {
				jLoopCount++;
				SortUtils.swapInts(arr, block, block -1);
				block--;
			}
	
			System.out.println("\n After one iteration");
			for (int ii = 0; ii < arr.length; ii++) {
				System.out.print(arr[ii] + " ");
			}
		}

		System.out.println("\n\nAfter sorting... \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\niLoopCount = " + iLoopCount);
		System.out.println("jLoopCount = " + jLoopCount);
	}
}