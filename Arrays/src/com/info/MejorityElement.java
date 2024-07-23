package com.info;

public class MejorityElement {

	public static int mejorityElement(int[] nums) {
		int res = -1;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {

			int n = nums.length / 2;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
					if (count > n-1) {
						return nums[i];
					}

				}
			}

		}
		return res;
	}

	public static void main(String[] args) {
//		int[] nums = { 2,2,1,1,1,2,2 };
			int[] nums= {3,2,3};
		System.out.println(mejorityElement(nums));
	}
}
