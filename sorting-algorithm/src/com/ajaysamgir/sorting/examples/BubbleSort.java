package com.ajaysamgir.sorting.examples;

public class BubbleSort {
	public static void main(String... strings) {
		int[] arr = new int[] { 1, 7, 2, 8, 3, 9, 4, 5 };
		int iLoopCount = 0;
		int jLoopCount = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length -1; i++) {
			iLoopCount ++;
			for (int j = i; j < arr.length-i-1; j++) {
				jLoopCount ++;
				if (arr[j] > arr[j+1]) {
					SortUtils.swapInts(arr, j, j+1);
				}
			}
			System.out.println("\n After one iteration");
			for (int ii = 0; ii < arr.length; ii++) {
				System.out.print(arr[ii] + " ");
			}
		}

		System.out.println("\n After sorting... \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("iLoopCount = " + iLoopCount);
		System.out.println("jLoopCount = " + jLoopCount);
	}
}
