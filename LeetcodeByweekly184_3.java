package Leetcode6;

public class LeetcodeByweekly184_3 {
	public static void main(String[] args) {
		int[] nums = {9,2,6,1};
		String s = "0101";
		long res = 0;
		for(int i = 0;i<s.length();i++) {
			if(i>0 && s.substring(i,i+1).equals("1")) {
				if(s.substring(i-1,i).equals("0")) {
					if(nums[i]>nums[i-1]) {
						res+=nums[i];
					}
					else if(nums[i]<nums[i-1]) {
						res+=nums[i-1];
					}
					else {
					res+=nums[i-1];}
				}
			}
			if(i>0 && s.substring(i,i+1).equals("1") && s.substring(i-1,i).equals("1")) {
				res+=nums[i];
			}
		}
		System.out.println(res);
	}
}
