package Leetcode5;

public class Leetcode27 {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		int res = 0;
		if (target > nums[nums.length - 1]) {
			res = nums.length;
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (target == nums[i]) {
					res = i;
					break;
				} else if (i > 0) {
					if (nums[i - 1] >= target && nums[i] <= target) {
						res = i;
						System.out.println(nums[i - 1] + " " + nums[i]);
						break;
					}
				} else {
					res = i + 1;
				}
			}
		}
		System.out.println(res);
	}

}
