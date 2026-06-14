package Leetcode6;

public class Leetcode1236 {
	public static void main(String[] args) {
		int[] nums = {999,19,199};
		int min = 10000000;
		for(Integer i = 0;i<nums.length;i++) {
			StringBuffer str =new StringBuffer(Integer.toString(nums[i]));
			int res = 0;
			for(int j = 0;j<str.length();j++) {
				res+=Integer.parseInt(str.substring(j,j+1));
			}
			nums[i]=res;
		}
		for(int i = 0;i<nums.length;i++) {
			min = Math.min(min, nums[i]);
		}
		System.out.println(min);
	}
}
