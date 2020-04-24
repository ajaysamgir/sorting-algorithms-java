package com.ajaysamgir.sorting.examples;

public class SelectionSort {

	public static void main(String... strings) {
		int[] arr = new int[] { 1, 7, 2, 8, 3, 9, 4, 5 };

		int iLoopCount = 0;
		int jLoopCount = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			iLoopCount++;
			for (int j = i + 1; j < arr.length; j++) {
				jLoopCount++;
				if (arr[i] > arr[j]) {
					SortUtils.swapInts(arr, i, j);
				}
			}
			
			System.out.println("After one iteration ");
			for (int ii = 0; ii < arr.length; ii++) {
				System.out.print(arr[ii] + " ");
			}
		}

		System.out.println("After sorting... \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("iLoopCount = " + iLoopCount);
		System.out.println("jLoopCount = " + jLoopCount);
	}
}
