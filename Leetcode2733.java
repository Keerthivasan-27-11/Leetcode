package Leetcode5;

public class Leetcode2733 {
	public static void main(String[] args) {
		int[] nums = {2,1,3};
		int min = 100,max = 0;
		for(int i = 0;i<nums.length;i++) {
			max=Math.max(max, nums[i]);
			min=Math.min(min, nums[i]);
		}
		int res = 0;
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]!=max && nums[i]!=min) {
				res = nums[i];
			}
		}
		if(res == 0) {
			res = -1;
		}
		
	}
}
