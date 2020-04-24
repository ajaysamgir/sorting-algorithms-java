package com.ajaysamgir.sorting.examples;

public class SortUtils {

	public static int[] swapInts(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

}
