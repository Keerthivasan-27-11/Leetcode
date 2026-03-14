package Leetcode31;

public class Leetcode1464 {
	public static void main(String[] args) {
		int[] nums= {3,7};
		int max = 0;
		for(int i = 0;i<nums.length;i++) {
			for(int j = 0;j<i;j++) {
				max = Math.max(max,(((nums[i]-1)*(nums[j]-1))));
			}
		}
		System.out.println(max);
	}
}
