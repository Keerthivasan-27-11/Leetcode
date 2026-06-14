package Leetcode6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Leetcode396 {
	public static void main(String[] args) {
		int[] nums = {4,3,2,6};
		int max = 0;
		int nu = Arrays.stream(nums).sum();
		for(int i = 0;i<nums.length;i++) {
			max += i * nums[i];
		}
		int res = max;
		for(int i=nums.length-1;i>=0;i--) {
			max += nu-(nums.length*nums[i]);
			res = Math.max(res, max);
		}
		System.out.println(res);
	}
}
