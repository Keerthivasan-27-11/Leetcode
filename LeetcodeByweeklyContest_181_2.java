package Leetcode6;

public class LeetcodeByweeklyContest_181_2 {
	public static void main(String[] args) {
		int[] nums = {30494606,875031872,850559628,844602130};//304994606,875031872,850559628,844602130
		int max = 0,maxi= 0;
		for(int i = 0;i<nums.length;i++) {
			if(max<nums[i]) {
				max = nums[i];
				maxi = i;
			}
		}
		System.out.println(max);
		long ass = 0, des = 0;
		for(int i = 0;i<nums.length;i++) {
			if(i<=maxi) {
				ass += nums[i];
			}
			if(i>=maxi) {
				des += nums[i];
			}
		}
		System.out.println(ass+" "+des);
		int res = 0;
		if(ass>des) {
			res = 0;
		}
		else if(des>ass) {
			res = 1;
		}
		else {
			res = -1;
		}
		System.out.println(res);
	}
}
