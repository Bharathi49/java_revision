package com.tyss.arrays;

public class FindMaxMin {

	public static void main(String[] args) {
		int[] nums = { 3, 5, 1, 2, 7, 10, 9 };

		int max = nums[0];
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (max > nums[i])
				max = nums[i];
			if (min < nums[i])
				min = nums[i];
		}
		System.out.println(max);
		System.out.println(min);
//		int temp;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] > nums[j]) {
//					temp = nums[i];
//					nums[i] = nums[j];
//					nums[j] = temp;
//				}
//			}
//		}
//		System.out.println("Min " + nums[0]);
//		System.out.println("Max " + nums[nums.length - 1]);
	}
}
