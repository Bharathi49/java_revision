package com.tyss.arrays;

public class SumPair {

	public static void main(String[] args) {

		int[] nums = { -12, 6, 5, -4, -2, -5, 6, 8, -1, -2 };
		int num = 9;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (num == Math.abs(nums[i] + nums[j])) {
					System.out.print("(" + nums[i] + "," + nums[j] + ")");
				}
			}

		}
	}

}
