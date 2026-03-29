package Leetcode4;

public class Leetcode22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,1,2};
		int n = nums.length;
		int j =0;
		do {
			int in = 0,de = 0;
			for(int i = 0;i<n-1;i++) {
				if(nums[i]>nums[i+1]) {
					in++;
				}
			}
			for(int i = 0;i<n-1;i++) {
				if(nums[i]<nums[i+1]) {
					de++;
				}
			}
			if(de==n-1 || in == n - 1) {
				break;
			}
			
		}while(n!=j);
	}

}
