package com.info;

public class SortArray {

	public static void swap(int[] arr, int a, int b) {

	}

	public static void main(String[] args) {
		int[] arr = { 10, 15, 12, 4, 5, 48, 42, 69, 78, 45 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, arr[i], arr[j]);
				}
			}
		}
	}
}
