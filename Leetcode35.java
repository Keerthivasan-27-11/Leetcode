package Leetcode6;

public class Leetcode35 {
	public static void main(String[] args) {
		int[] nums = {1,4,5,6};
		int target = 7;
		int res = -1;
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]==target) {
				res = i;
				break;
			}
			else if(nums[i]>target) {
				res = i;
				break;
			}
		}
		if(res == -1) {
			res = nums.length;
		}
		System.out.println(res);
	}
}
