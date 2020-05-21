package com.tyss.arrays;

public class MissingElement {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 8, 9 };
		int res = missEle(nums);
		System.out.println(res);
	}

	public static int missEle(int[] nums) {

		int sumTotal = 9 * (9 + 1) / 2;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		return sumTotal - sum;
	}
}
