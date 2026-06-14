package Leetcode6;

public class Leetcode55 {
	public static void main(String[] args) {
		int[] nums = {};
		boolean b = false;
		int a = 0;
		for(int i = 0;i<nums.length;i++) {
			if(nums[nums[i]]!=0) {
				a++;
			}
			else if(nums[nums[i]]>=nums.length) {
				a++;
			}
		}
		if(a == nums.length || nums.length==1) {
			b = true;
		}
		System.out.println(b);
	}
}
