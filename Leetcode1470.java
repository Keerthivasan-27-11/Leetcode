package Leetcode5;

public class Leetcode1470 {
	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int[] num1 = new int[nums.length/2];
		int[] num2 = new int[nums.length/2];
		for(int i = 0;i<nums.length/2;i++) {
			num1[i]= nums[i];
		}
		int co1 = 0;
		for(int i = nums.length/2;i<nums.length;i++) {
			num2[co1++]= nums[i];
		}
		int[] res = new int[nums.length];
		int co = 0;
		for(int i = 0;i<num1.length;i++) {
			res[co++]=num1[i];
			res[co++]=num2[i];
		}
		for(int i = 0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
}
