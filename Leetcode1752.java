package Leetcode6;

public class Leetcode1752 {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int j = 0;
		boolean b = false;
		int[] res = new int[nums.length];
		while(j!=nums.length) {
			int a = 0,c = 0;
			for(int i = j;i<(j+nums.length);i++) {
				res[c++]=nums[i%nums.length];
			}
			for(int i = 0;i<nums.length-1;i++) {
				if(res[i]<=res[i+1]) {
					a++;
				}
			}
			if(a==nums.length-1) {
				b = true;
				break;
			}
			j++;
		}
		System.out.println(b);
	}
}
