package com.info;

public class ThreeSumClosest {
	public static int threeSumClosest(int[] nums, int target) {
		
		int result=-1;
		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			int sum = nums[i] + nums[left] + nums[right];
		
			while (left < right) {
				if (sum == target) {
					result= sum;

				} else if (sum < target) {
					left++;
				} else {
					right--;
				}
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		System.out.println(threeSumClosest(nums, target));
	}

}
