package com.tyss.arrays;

public class MaxProduct {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 5, 7, 3, 6, 8, 4, 4 };
		int maxPro = 0;
		for (int i = 1; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (maxPro < (nums[i] * nums[j]))
					maxPro = nums[i] * nums[j];
			}
		}
		System.out.println(maxPro);
	}

}
