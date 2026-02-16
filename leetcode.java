package Leetcode2;

public class leetcode {
	public static void main(String[] args) {
		int[] nums = {2,4,6,8};
		int total = 0;
		for(int i = 0;i<nums.length-1 ;i++) {
			int a= 0, n= 0;
			for(int j=0;j<i+1;j++) {
				a+=nums[j];
				}
			for(int k =i+1;k<nums.length;k++) {
				n+=nums[k];
				System.out.print(nums[k]);
			}
			if((a-n)%2 == 0) {
				total ++;
			}
		}
		System.out.println(total );
	}
}
