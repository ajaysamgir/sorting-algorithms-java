package com.ajaysamgir.sorting.examples;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 7, 2, 8, 3, 9, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		new MergeSort().mergeSort(arr);
	}

	private void mergeSort(int[] arr) {

		if (arr.length < 2) {
			return;
		}
		int n = arr.length;
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		int i = 0;
		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		for (int l = mid, j = 0; l < arr.length; l++, j++) {
			right[j] = arr[l];
		}

		mergeSort(left);
		mergeSort(right);

		for (int l = 0; l < left.length; l++) {
			if (left[l] > right[l]) {
				arr[l] = right[l];
			}
		}
		
		System.out.println();
		for (int iii = 0; iii < arr.length; iii++) {
			System.out.print(arr[iii] + " ");
		}
	}
}
