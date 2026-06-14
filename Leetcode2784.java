package Leetcode6;

public class Leetcode2784 {
	public static void main(String[] args) {
		int[] nums = {9,9};
		int a = 0, max = 0,n1 = nums.length-1;
		boolean b = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int n = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = n;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		if (nums.length == 1) {
			b = false;
		} else if (nums.length == 2) {
			if (nums[0] == n1 && nums[1]==n1) {
				b = true;
			}
		} else if (nums.length > 2) {
			if (nums[nums.length - 1] == nums[nums.length - 2] && nums.length == max + 1
					&& nums[nums.length - 3] == nums[nums.length - 1] - 1) {
				b = true;
			}
		}
		System.out.println(b);
	}
}
