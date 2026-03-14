package Leetcode31;

public class Leetcode3232 {
	public static void main(String[] args) {
		int[] nums = {5,5,5,25};
		int d10= 0;
		int d11=0;
		boolean b = false;
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]<=9 && nums[i]>=1) {
				d10+=nums[i];
			}
			else if(nums[i]>=10) {
				d11+=nums[i];
			}
		}
		int a = Math.max(d10, d11),c=Math.min(d11, d10);
		if(a>c) {
			b = true;
		}
		System.out.println(b);
	}
}
