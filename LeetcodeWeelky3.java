package Leetcode5;

public class LeetcodeWeelky3 {
	public static void main(String[] args) {
		int[] nums = {21,12,18,19};
		long res = 0,min = Math.powExact(10, 9);
		int j = 0;
		int[] nums1 = new int[nums.length];
		for(int i = 1;i<nums.length-1;i++) {
			res = 0;j = 0;
			
			nums1=nums;
		while(j != 1) {
			if(nums1[i]>nums1[i-1] && nums1[i]>nums1[i+1]) {
				j = 1;
				break;
			}
			else {
				res++;
				nums1[i]++;
			}
		}
		int a = nums1[i];
		long b = 0;
		for(int i1 = 1;i1<nums1.length-1;i1++) {
			b = Math.max(nums1[i1], b);
		}
		System.out.println(b);
		if(a == b) {
		min = Math.min(min, res);
		}}
		System.out.println(min);
	}
}
