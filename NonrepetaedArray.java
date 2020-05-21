package com.tyss.arrays;

public class NonrepetaedArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 2, 3, 4, 5 };
		int[] res = new int[nums.length];
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			int j;
			for (j = 0; j < i; j++)
				if (nums[i] == nums[j])
					break;

			if (i == j) {
				res[k] = nums[i];
				k++;
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
	}
}
