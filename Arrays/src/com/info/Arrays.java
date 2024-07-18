package com.info;

import java.util.Scanner;

public class Arrays {
	static Scanner sc = new Scanner(System.in);

	public static void insertArr(int[] arr) {

		System.out.println("please enter arrays element");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
	}

	//count of repeated number;
	public static int countOfOccurance(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				count++;

			}

		}
			return count;
	}
	
	
//number of element greather than x
	public static int greater(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > target) {
				count++;

			}

		}
			return count;
	}	
	
	
	
//	check the if given array sorted or not
	
	public static boolean sorted(int[] arr) {
      boolean result=true;
		//checking in ascending order
		for(int i=0;i<arr.length;i++) {
			if( arr[i]<=arr[i+1]  ) {
				result=true;
			}
			else {
				result=false;
			}
		}
		return result;
		
	
	}
	
	
	public static void display(int[] arr) {
		System.out.println(" arrays element");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

	}

	public static void main(String[] args) {

//		int[] arr = new int[10];
		int[] arr= {10,15,12,4,5,48,42,69,78,45};
//		int[] arr= {10,15,18,48,69,78,85};

//		insertArr(arr);
		System.out.println("Total number of Occurance : " +countOfOccurance(arr, 12));
		System.out.println("Total number of greather than : " +greater(arr, 12));
        System.out.println("Array is sorted :"+sorted(arr));
//		display(arr);
	}

}
