package com.tyss.arrays;

public class DuplicateEle {

	public static void main(String[] args) {
		
		int[] nums= {0,3,1,2,3,4};
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					System.out.println(nums[i]);
					break;
				}
			}
		}
	}
}
