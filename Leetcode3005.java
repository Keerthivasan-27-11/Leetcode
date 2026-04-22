package Leetcode5;


public class Leetcode3005 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int max = 0;
		for(int i = 0;i<nums.length;i++) {
			int a= 0;
			for(int j = 0;j<nums.length;j++) {
				if(nums[i] == nums[j]) {
					a++;
				}
			}
			max = Math.max(max, a);
		}
		int j = 0,count = 0;
		while(j!=nums.length) {
			int a = 0;
			for(int i = 0;i<nums.length;i++) {
				if(nums[j]==nums[i]) {
					a ++;
				}
			}
			if(a == max) {
				count ++;
			}
			j++;
		}
		System.out.println(count);
	}
}
