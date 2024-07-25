package com.info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSumUsingTwoPointer {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };

		System.out.println("set of the sums : " + threeSum(arr));

	}

	private static List<List<Integer>> threeSum(int[] arr) {
		Arrays.sort(arr);
		
		ArrayList<List<Integer>> list=new ArrayList<>();
		HashSet<List<Integer>> hashSet = new HashSet<>();
		for (int i = 0; i < arr.length - 2; i++) {
			int left = i + 1;
			int right = arr.length - 1;

			
			while(left<right) {
				int sum = arr[i] + arr[left] + arr[right];
				if (sum == 0) {
		               hashSet.add(Arrays.asList(arr[i],arr[left] , arr[right]));
		               left++;
		               right--;
					}
					else if(sum<0) {
						left++;
					}
					else {
						right--;
					}
			}
		}
		
		list.addAll(hashSet);
		return list;
	}
}
