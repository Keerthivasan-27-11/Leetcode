package Leetcode5;

public class LeetcodeBYWeelkycontest1850_2 {
	public static void main(String[] args) {
		int[] nums = {12,54,32,22};int digit = 2;
		String str = "";
		for(int i = 0 ;i<nums.length;i++) {
			str += Integer.toString(nums[i]);
		}
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.substring(i,i+1).equals(Integer.toString(digit))) {
				count ++;
			}
		}
		System.out.println(count);
	}
}
