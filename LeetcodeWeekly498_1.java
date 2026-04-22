package Leetcode5;

public class LeetcodeWeekly498_1 {
	public static void main(String[] args) {
		int[] nums = {3,2,1};
		int k = 1;
		int res = -1;
		for(int i = 0;i<nums.length;i++) {
			int a = 0,b =(int) Math.powExact(10, 9);
			for(int j = 0;j<nums.length;j++) {
				if(j<=i) {
				a=Math.max(a, nums[j]);}
				if(j>=i)                      {
				b=Math.min(b,nums[j]);
				}
			}
			if(Math.abs(a-b)<=k) {
				res = i;
				break;N
			}
		}
		System.out.println(res);
	}
}
