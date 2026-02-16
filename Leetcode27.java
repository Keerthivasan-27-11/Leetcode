package Leetcode2;

public class Leetcode27 {
	public static void main(String[] args) {
		int[] nums = {3,2,2,3};int val = 3;
		String res = "";
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]==val) {
				continue;
			}
			else {
				res +=Integer.toString(nums[i]);
			}
		}
		System.out.println(res);
	}
}
