package Leetcode6;

public class Leetcode162 {
	public static void main(String[] args) {
		int[] nums = {1,2,1,3,5,6,4};//-2147483648,-2147483647
		int a = 0;long max =(long) -Math.pow(2, 31);
		for(int i  =0;i<nums.length;i++) {
			if(max<nums[i]) {
				max = nums[i];
				a = i;
			}
		}
		System.out.println(a);
	}
}
