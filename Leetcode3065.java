package Leetcode4;

public class Leetcode3065 {

	public static void main(String[] args) {
		int[] nums = {1,1,2,4,9};
		int k = 9;
		for(int i= 0 ;i<nums.length;i++) {
			for(int j = 0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					int a = nums[j] ;
					nums[j]=nums[j+1];
					nums[j+1]= a;
				}
			}
		}
		int count  = 0;
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]<k) {
				count++;
			}
		}
		System.out.println(count);
	}
}
