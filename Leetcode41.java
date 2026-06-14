package Leetcode6;

public class Leetcode41 {
	public static void main(String[] args) {
		int[] nums = {1,2,0};
		int miss = -1;
		for(int i=1;i<=nums.length;i++) {
			int a = 0;
			for(int j = 0;j<nums.length;j++) {
				if(i!=nums[j]) {
					a++;
				}
			}
			if(a == nums.length) {
				miss = i;
				break;
			}
		}
		int max = 0;
		if(miss == -1) {
		for(int i = 0;i<nums.length;i++) {
			max = Math.max(max, nums[i]);
		}
		miss = max + 1;}
		System.out.println(miss);
	}
}
