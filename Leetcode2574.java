package Leetcode6;

public class Leetcode2574 {
	public static void main(String[] args) {
		int[] nums = {10,4,8,3};
		int[] l = new int[nums.length];
		int[] r = new int[nums.length];
		int l1 = 0,r1 = 0;
		for(int i = 1;i<nums.length;i++) {
			l[i] = l1+nums[i-1];
			l1 = l[i];
		}
		for(int j = nums.length-2;j>=0;j--) {
			r[j] = r1+nums[j+1];
			r1 = r[j];
		}
		int[] res = new int[l.length];
		for(int i = 0;i<nums.length;i+=1) {
			res[i] = Math.abs(l[i]-r[i]);
		}
	}
}
