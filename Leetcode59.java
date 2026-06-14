package Leetcode6;

import java.util.*;

public class Leetcode59 {
	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int a = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = a;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
