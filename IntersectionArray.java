package com.tyss.arrays;

public class IntersectionArray {

	public static void main(String[] args) {

		int[] nums1 = { 21, 34, 41, 22, 35 };
		int[] nums2 = { 61, 34, 45, 21, 11 };
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i]==nums2[j]) {
					System.out.println(nums1[i]);
//					break;
				}
			}
		}
	}

}
