package com.tyss.arrays;

public class MultipleDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 2, 3, 7, 3, 1 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					System.out.println(nums[i]);
				}
			}
		}
	}
}
