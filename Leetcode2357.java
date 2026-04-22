package Leetcode5;

import java.util.*;

public class Leetcode2357 {
	public static void main(String[] args) {
		int[] nums = {0};
		int min = 100, total = 0, j = 0, a = 0;
		while (a != 1) {
			j = 0;
			min = 100;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 0) {
					j++;
				}
			}
			if (j == nums.length) {
				a++;
				break;
			} else {
				for (int i = 0; i < nums.length; i++) {
					if (nums[i] > 0) {
						min = Math.min(min, nums[i]);
					}
				}
				for (int i = 0; i < nums.length; i++) {
					if (nums[i] > 0) {
						nums[i] = nums[i] - min;
					}
				}
				for (int i = 0; i < nums.length; i++) {
					System.out.print(nums[i]);
				}
				System.out.println();
				total ++;
			}
		}
		System.out.println(total);
	}
}
