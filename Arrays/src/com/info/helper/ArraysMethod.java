package com.info.helper;

import java.util.Scanner;

public class ArraysMethod {

	static Scanner sc = new Scanner(System.in);

	public static void insertArr(int[] arr) {

		System.out.println("please enter arrays element");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

		}
	}

	public static void display(int[] arr) {
		System.out.println(" arrays element");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

	}

}
