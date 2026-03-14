package Leetcode31;

public class Leetcoeweekly_lFindtheSmallestBalancedIndex {
	public static void main(String[] args) {
		int[] nums = {2,1,2};
		int index = 0; 
		int n = nums.length;
		System.out.println(n);
		for(int i = 0;i<nums.length;i++) {
			int sum = 0,product = 1;
			for(int j = 0;j<nums.length;j++) {
				if(j<i) {
					sum+=nums[j];
				}
				else if(j>i) {
					product*=nums[j];
				}
			}
			if(sum == product) {
				index= i;
			}
		}
		System.out.println(index);
	}
}
